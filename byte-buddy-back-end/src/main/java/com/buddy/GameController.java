package com.buddy;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
	
	GameService gameService;
    public GameController(GameService gameService) {
		this.gameService = gameService;
	}

	@GetMapping("/games")
    public String getGames() {
        return "GET /games";
    }
	
	@PostMapping("/games")
    public String postGames() {
        return "POST /games";
    }
	
	@PutMapping("/games")
    public String putGames() {
        return "PUT /games";
    }
	
	@DeleteMapping("/games")
    public String deleteGames() {
        return "DELETE /games";
    }
}
