package com.buddy;


import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ByteBuddyApplication {
	
    @GetMapping("/")
    public String getGenericWelcomeMessage() {
        return "welcome to byte buddy";
    }
	
    @GetMapping("/players")
    public String getPlayers() {
        return "GET /players";
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
	
	public static void main(String[] args) {
		String uri = "db-string-here";
		
		SpringApplication.run(ByteBuddyApplication.class, args);
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("bet-buddy");
            MongoCollection<Document> collection = database.getCollection("betByteGamesNba");
            Document doc = collection.find(eq("betByte", "No Derik Queen tonight (Injured).")).first();
            if (doc != null) {
                System.out.println(doc.toJson());
            } else {
                System.out.println("No matching documents found.");
            }
        }
	}

}
