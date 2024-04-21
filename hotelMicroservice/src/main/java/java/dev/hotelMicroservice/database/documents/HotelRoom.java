package java.dev.hotelMicroservice.database.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

@Document(collection = "hotelRoom")
public class HotelRoom {
    @Id
    private String id;
    private String roomNumber;
    private String description;
    private double price;
}
