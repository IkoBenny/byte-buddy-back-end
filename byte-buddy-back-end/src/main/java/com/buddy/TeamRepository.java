package com.buddy;

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
}
