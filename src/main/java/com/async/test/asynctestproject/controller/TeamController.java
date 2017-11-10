package com.async.test.asynctestproject.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.async.test.asynctestproject.entity.Team;
import com.async.test.asynctestproject.service.TeamService;

@RestController
public class TeamController {
	
	private TeamService teamService;
	
	public TeamController(TeamService teamService)
	{
		this.teamService = teamService;
	}
	
	@GetMapping("/teams")
	public List<Team> getTeams()
	{
		return teamService.getAllTeams();
	}

	@GetMapping("/team/{teamId}")
	public Team getTeamById(@PathVariable(name="teamId")Integer teamId)
	{
		return teamService.getTeamById(teamId);
	}
	
	@PostMapping("/addTeam")
	public void addTeam(@RequestBody Team team) 
	{
		System.out.println("team adding: " + team.getName());
		Team t = teamService.addTeam(team);
		System.out.println("Team Added");
		System.out.println("ID: "+ t.getId() + "Name: " + t.getName());
	}
	
	
	@PutMapping("/updateTeam")
	public void updateTeam(@ModelAttribute Team team){
		Team t = teamService.updateTeam(team);
		System.out.println("Team updated:");
		System.out.println("ID: "+ t.getId() + "Name: " + t.getName());
		System.out.println("finish adding team");
	}
	
	@GetMapping("/deleteTeam/{teamId}")
	public void deleteTeam(@PathVariable(name = "teamId") int teamId) {
		teamService.deleteTeam(teamId);
	}
}
