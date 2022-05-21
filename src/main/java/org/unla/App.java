package org.unla;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import org.bson.Document;
import org.unla.mongodbtp.entidades.*;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


public class App
{
    //
    public static void main( String[] args )
    {
        //1
        //En la clase InstanciaDatos se generan las ventas utilizando las entidades ya definidas como productos, sucursales o personas, y se randomizan otros valores como cantidad de elementos comprados, para
        //obtener variaciones en cada venta
        List<Venta> ventas = InstanciaDatos.instanciarVentas();

        //2
        //Generacion de String en formato Json de la lista de ventas
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonString = gson.toJson(ventas);
        System.out.println(jsonString);

        //3
        //Guardado de cada venta en MongoDB
        try {
            MongoClient mongoClient = new MongoClient("localhost", 27017);
            MongoDatabase database = mongoClient.getDatabase("ventas_BD2");
            MongoCollection<Document> collection = database.getCollection("ventas");

            String ventaAPersistir;
            List<Document> docs = new ArrayList<Document>();
            for(Venta v:ventas){
                ventaAPersistir = gson.toJson(v);
                docs.add(Document.parse(ventaAPersistir));
            }
            collection.insertMany(docs);

        }catch(Exception e){
            System.out.println(e);
        }











    }
}
