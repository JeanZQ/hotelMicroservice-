package dev.hotel_service.api.types;
    public record HotelRoomControllerRequest (
            Integer roomNumber,
            String description,
            double price
    ) {
}
