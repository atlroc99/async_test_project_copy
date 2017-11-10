package com.async.test.asynctestproject.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.async.test.asynctestproject.entity.Team;
import com.async.test.asynctestproject.repository.TeamRepository;

@Service
public class TeamService {

	private TeamRepository teamRepository;

	public TeamService(TeamRepository teamRepository) {
		this.teamRepository = teamRepository;
	}

	public List<Team> getAllTeams() {
		List<Team> teams = new ArrayList<Team>();
		teams = teamRepository.findAll();
		printTeamTest(teams);

		return teams;
	}

	public Team getTeamById(Integer teamId) {
		if (teamId != null && teamId > 0) {
			Team team = new Team();
			team = teamRepository.findOne(teamId);
			printTeamById(team);
			return team;
		}

		return new Team("no match found");
	}

	private void printTeamTest(List<Team> teams) {
		if (!teams.isEmpty()) {
			Collections.sort(teams, (team1, team2) -> team1.getId().compareTo(team2.getId()));
			teams.forEach(team -> System.out.println(team));
		} else {
			System.out.println("Database returned empty list of Team");
		}
	}

	public Team updateTeam(Team team) {
		return teamRepository.saveAndFlush(team);
	}

	public void deleteTeam(int teamId) {
		
		teamRepository.delete(teamId);
	}
	
	public Team addTeam(Team team){
		System.out.println("Inside - TeamService class and about to add team");
		return teamRepository.saveAndFlush(team);
	}
	
	private void printTeamById(Team team) {
		if (team != null)
			System.out.println(team);
	}
}
