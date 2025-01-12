package ahmed.java.carservice.repository;

import ahmed.java.carservice.entity.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CLIENTS", url = "http://localhost:8888")
public interface ClientServiceFeignClient {
    @GetMapping("/api/client/{id}")
    Client getClientById(@PathVariable("id") Long id);
}