package com.buddy;

import org.springframework.stereotype.Service;

@Service
public class TeamService {
	TeamRepository teamRepository;

	public TeamService(TeamRepository teamRepository) {
		this.teamRepository = teamRepository;
	}
	
}
