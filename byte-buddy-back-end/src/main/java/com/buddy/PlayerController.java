package com.buddy;

import java.util.List;

import org.bson.Document;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {
	
	PlayerService playerService;	
    public PlayerController(PlayerService playerService) {
		this.playerService = playerService;
	}

	@GetMapping("/players")
    public String getByteWithPlayerName(@RequestParam(required = true, name="player") String player) {
        return playerService.getDocumentsByName(player);
    }
	
	@GetMapping("/players/date")
    public List<Document> getByteWithDate(@RequestParam(required = true, name="day") int day,
    		@RequestParam(required = true, name="month") int month,
    		@RequestParam(required = true, name="year") int year) {
        return playerService.getDocumentsByDate(day, month, year);
    }

	@PostMapping("/players")
    public String postPlayers() {
        return "POST /players";
    }
	
	@PutMapping("/players")
    public String putPlayers() {
        return "PUT /players";
    }
	
	@DeleteMapping("/players")
    public String deletePlayers() {
        return "DELETE /players";
    }
}
