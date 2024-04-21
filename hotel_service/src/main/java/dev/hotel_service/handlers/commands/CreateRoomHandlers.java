package dev.hotel_service.handlers.commands;

import dev.hotel_service.database.documents.HotelRoom;
import dev.hotel_service.database.repositories.HotelRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CreateRoomHandlers {
    @Autowired
    private HotelRoomRepository repository;
    public record Command(
            Integer roomNumber,
            String description,
            double price
    ){}

    public HotelRoom handle(Command command){
        if(command.description.isEmpty() || command.description.isEmpty() || command.price < 0){
            return null;
        }
        HotelRoom hr = new HotelRoom();
        hr.setDescription(command.description());
        hr.setPrice(command.price);
        hr.setRoomNumber(command.roomNumber);
        repository.save(hr);
        return hr;
    }
}
