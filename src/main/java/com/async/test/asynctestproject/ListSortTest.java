package com.async.test.asynctestproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.async.test.asynctestproject.entity.Team;

public class ListSortTest {
	
	public static void main(String[] str)
	{
		Team team1 = new Team("team1");
		team1.setId(100);
		
		Team team2 = new Team("team2");
		team2.setId(200);
		
		Team team3 = new Team("team3");
		team3.setId(300);
		
		List<Team> teams = new ArrayList<Team>();
		teams.add(team2);
		teams.add(team1);
		teams.add(team3);
		
		teams.forEach(team->System.out.println(team));
		
		System.out.println("\n");
		Collections.sort(teams, (t1,t2)-> t1.getId().compareTo(t2.getId()));
		
		teams.forEach(team -> System.out.println(team));
		
	}
}
