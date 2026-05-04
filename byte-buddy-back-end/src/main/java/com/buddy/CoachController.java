package com.buddy;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {
	CoachService coachService;
	
	public CoachController(CoachService coachService) {
		this.coachService = coachService;
	}

	@GetMapping("/coaches")
    public String getCoaches() {
        return "GET /coaches";
    }
	
	@PostMapping("/coaches")
    public String postCoaches() {
        return "POST /coaches";
    }
	
	@PutMapping("/coaches")
    public String putCoaches() {
        return "PUT /coaches";
    }
	
	@DeleteMapping("/coaches")
    public String deleteCoaches() {
        return "DELETE /coaches";
    }
}
