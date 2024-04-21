package dev.hotel_service.database.repositories;

import dev.hotel_service.database.documents.HotelRoom;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HotelRoomRepository extends MongoRepository<HotelRoom, String> {
}
