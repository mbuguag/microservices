package com.example.milk_collection_service.client;


import com.example.milk_collection_service.model.Farmer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "farmer-service", url = "http://localhost:8081/api/farmers")
public interface FarmerClient {
    @GetMapping("/{id}")
    Farmer getFarmerById(@PathVariable("id") Long id);
}

