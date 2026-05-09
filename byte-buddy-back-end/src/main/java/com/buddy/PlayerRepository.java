package com.buddy;

import static com.mongodb.client.model.Filters.eq;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.Document;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import static com.mongodb.client.model.Filters.*;

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
    
    public List<Document> getDocumentsByName(String player) {
    	List<Document> documents = new ArrayList<>();
       return playerCollection.find(eq("player", player)).into(new ArrayList<>());
    }
    
    public List<Document> getDocumentsByDate(int day, int month, int year) {
		List<Document> documents = new ArrayList<>();
		ZoneId zone = ZoneId.systemDefault();
		LocalDate date = LocalDate.of(year, month, day);
		
	    Instant startInstant = date.atStartOfDay(zone).toInstant();
	    Instant endInstant = date.plusDays(1).atStartOfDay(zone).toInstant();
	    

	    ObjectId startId = new ObjectId(Date.from(startInstant));
	    ObjectId endId = new ObjectId(Date.from(endInstant));
		
	    documents = playerCollection.find(and(
                gte("_id", startId),
                lt("_id", endId)
        )).into(new ArrayList<>());
	    
	    return documents;
    }
    

}
