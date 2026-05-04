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
    public String getByteWithPlayerName(@RequestParam(required = false, name="first") String first,
            @RequestParam(required = true, name="last") String last) {
        return playerService.getDocumentsByLastName(last);
    }
	
	@GetMapping("/players/date")
    public List<Document> getByteWithDate(@RequestParam(required = true, name="date") String date) {
        return playerService.getDocumentsByDate(date);
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
