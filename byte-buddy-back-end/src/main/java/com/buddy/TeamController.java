package com.buddy;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {
	TeamService teamService;
    public TeamController(TeamService teamService) {
		this.teamService = teamService;
	}

	@GetMapping("/teams")
    public String getTeams() {
        return "GET /teams";
    }
	
	@PostMapping("/teams")
    public String postTeams() {
        return "POST /teams";
    }
	
	@PutMapping("/teams")
    public String putTeams() {
        return "PUT /teams";
    }
	
	@DeleteMapping("/teams")
    public String deleteTeams() {
        return "DELETE /teams";
    }
}
