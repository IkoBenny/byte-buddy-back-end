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
	
	public String getDocumentsByName(String player) {
		Document doc = playerRepository.getDocumentsByName(player);
		String json = doc.toJson();
		return json;
	}
	
	public List<Document> getDocumentsByDate(int day, int month, int year) {
		List<Document> documents = playerRepository.getDocumentsByDate(day, month, year);
		return documents;
	}
}
