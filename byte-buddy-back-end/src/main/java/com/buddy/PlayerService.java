package com.buddy;

import java.util.List;

import org.bson.Document;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
	PlayerRepository playerRepository;

	public PlayerService(PlayerRepository playerRepository) {
		this.playerRepository = playerRepository;
	}
	
	public String getDocumentsByLastName(String last) {
		Document doc = playerRepository.getDocumentsByLastName(last);
		String json = doc.toJson();
		return json;
	}
	
	public List<Document> getDocumentsByDate(String date) {
		List<Document> documents = playerRepository.getDocumentsByDate(date);
		return documents;
	}
}
