package java.dev.hotelMicroservice.database.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.dev.hotelMicroservice.database.documents.HotelRoom;

public interface HotelRommRepository extends MongoRepository<HotelRoom, String> {

}
