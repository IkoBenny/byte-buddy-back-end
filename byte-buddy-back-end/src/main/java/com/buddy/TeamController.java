package com.buddy;

import java.util.List;

import org.bson.Document;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class TeamController {
	TeamService teamService;
    public TeamController(TeamService teamService) {
		this.teamService = teamService;
	}

	@GetMapping("/teams")
    public List<Document> getByteWithPlayerName(@RequestParam(required = true, name="team") String team) {
        return teamService.getDocumentsByName(team);
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
