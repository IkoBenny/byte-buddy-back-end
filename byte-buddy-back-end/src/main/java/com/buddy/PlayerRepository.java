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
public class PlayerRepository {
    private String collectionName = "betBytePlayersNba";
    private String databaseName ="bet-buddy";
    private final MongoCollection<Document> playerCollection;
    private final MongoDatabase db;
    
    public PlayerRepository(MongoClient mongoClient) {    	
        this.db = mongoClient.getDatabase(databaseName);
        this.playerCollection = db.getCollection(collectionName);
    }
    
    public Document getDocumentsByLastName(String last) {
       return playerCollection.find(eq("last", last)).first();
    }
    
    public List<Document> getDocumentsByDate(String date) {
		List<Document> documents = new ArrayList<>();
        return playerCollection.find(eq("date", date))
        		.into(documents);
    }
    

}
