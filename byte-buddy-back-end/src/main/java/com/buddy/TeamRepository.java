package com.buddy;

import static com.mongodb.client.model.Filters.eq;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.springframework.stereotype.Repository;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@Repository
public class TeamRepository {
    private String collectionName = "betByteTeamsNba";
    private String databaseName ="bet-buddy";
    
    private final MongoCollection<Document> teamCollection;
    
    public TeamRepository(MongoClient mongoClient) {
        MongoDatabase db = mongoClient.getDatabase(databaseName);
        this.teamCollection = db.getCollection(collectionName);
    }
    
    public List<Document> getDocumentsByName(String team) {
    	List<Document> documents = new ArrayList<>();
       return teamCollection.find(eq("team", team)).into(new ArrayList<>());
    }
}
