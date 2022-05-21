package org.unla;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Consultas {
    public static void main(String[] args) {
        //conexion a la base
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("ventas_BD2");
        MongoCollection<Document> collection = database.getCollection("ventas");

        System.out.println(collection.countDocuments());

        //Generar consultas:
        //Consulta 1

        //Consulta 2

        //Consulta 3

        //Consulta 4

        //Consulta 5

        //Consulta 6

        //Consulta 7

        //Consulta 8
    }

}
