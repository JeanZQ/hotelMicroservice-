package java.dev.hotel_service.client.basic_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "basic_service")
public interface basic_service_client {
    @PostMapping("api/public/basic/bye/{num}")
    Integer getBye(@PathVariable("num") int num);
}
