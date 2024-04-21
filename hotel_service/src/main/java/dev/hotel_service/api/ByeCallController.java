package dev.hotel_service.api;

import dev.hotel_service.client.basic_service.basic_service_client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ByeCallController {
    @Autowired
    private basic_service_client basicService;
    @GetMapping("/getBye/{num}")
    public String getBye(@PathVariable("num") int num){
        Integer num_basic = basicService.getBye(num);
        return "I am Basic MongoDB Service with num= " + num + " and I received the num= "+num_basic+" from Basic Service";
    }
}
