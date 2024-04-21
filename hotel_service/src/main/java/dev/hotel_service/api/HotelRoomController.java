package dev.hotel_service.api;

import dev.hotel_service.api.types.HotelRoomControllerRequest;
import dev.hotel_service.database.documents.HotelRoom;
import dev.hotel_service.handlers.commands.CreateRoomHandlers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelRoomController {
    @Autowired
    CreateRoomHandlers handler;

    @PostMapping(value = "/Room")
    public HotelRoom register (@RequestBody HotelRoomControllerRequest payload){
        return handler.handle(new CreateRoomHandlers.Command(
                payload.roomNumber(),
                payload.description(),
                payload.price()
        ));
    }
}