package java.dev.hotel_service.database.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.dev.hotel_service.database.documents.HotelRoom;

public interface HotelRoomRepository extends MongoRepository<HotelRoom, String> {
}
