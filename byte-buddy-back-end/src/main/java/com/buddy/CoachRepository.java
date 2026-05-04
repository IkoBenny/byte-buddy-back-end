package com.buddy;

import org.bson.Document;
import org.springframework.stereotype.Repository;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@Repository
public class CoachRepository {
    private String collectionName = "betByteCoachesNba";
    private String databaseName ="bet-buddy";
	private final MongoCollection<Document> coachCollection;
	
    public CoachRepository(MongoClient mongoClient) {
        MongoDatabase db = mongoClient.getDatabase(databaseName);
        this.coachCollection = db.getCollection(collectionName);
    }

}
