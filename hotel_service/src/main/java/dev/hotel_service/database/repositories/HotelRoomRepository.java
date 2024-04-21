package dev.hotel_service.database.repositories;

import dev.hotel_service.database.documents.HotelRoom;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRoomRepository extends MongoRepository<HotelRoom, String> {

}
