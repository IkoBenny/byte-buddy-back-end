package com.buddy;

import org.springframework.stereotype.Service;

@Service
public class CoachService {
	CoachRepository coachRepository;

	public CoachService(CoachRepository coachRepository) {
		this.coachRepository = coachRepository;
	}
}
