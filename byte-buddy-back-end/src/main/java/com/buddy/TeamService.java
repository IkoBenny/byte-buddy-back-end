package com.buddy;

import java.util.List;

import org.bson.Document;
import org.springframework.stereotype.Service;

@Service
public class TeamService {
	TeamRepository teamRepository;

	public TeamService(TeamRepository teamRepository) {
		this.teamRepository = teamRepository;
	}
	
	public List<Document> getDocumentsByName(String team) {
		List<Document> documents = teamRepository.getDocumentsByName(team);
		return documents;
	}
}
