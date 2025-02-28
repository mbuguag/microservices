package com.example.Farmer_Service.controller;


import com.example.Farmer_Service.model.Farmer;
import com.example.Farmer_Service.service.FarmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/farmers")
public class FarmerController {
    @Autowired
    private FarmerService farmerService;

    @GetMapping
    public List<Farmer> getFarmers() {
        return farmerService.getAllFarmers();
    }

    @PostMapping
    public Farmer addFarmer(@RequestBody Farmer farmer) {
        return farmerService.addFarmer(farmer);
    }
}

