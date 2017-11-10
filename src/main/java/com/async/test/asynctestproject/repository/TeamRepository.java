package com.async.test.asynctestproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.async.test.asynctestproject.entity.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer>{

	
}
