package com.buddy;

import org.bson.Document;
import org.springframework.stereotype.Repository;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@Repository
public class GameRepository {
    private String collectionName = "betByteGamesNba";
    private String databaseName ="bet-buddy";
    private final MongoCollection<Document> gameCollection;
    
    public GameRepository(MongoClient mongoClient) {
        MongoDatabase db = mongoClient.getDatabase(databaseName);
        this.gameCollection = db.getCollection(collectionName);
    }

}
