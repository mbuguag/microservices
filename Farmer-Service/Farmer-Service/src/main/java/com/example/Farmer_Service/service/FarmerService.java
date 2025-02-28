package com.example.Farmer_Service.service;


import com.example.Farmer_Service.model.Farmer;
import com.example.Farmer_Service.repository.FarmerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmerService {
    @Autowired
    private FarmerRepository farmerRepository;

    public List<Farmer> getAllFarmers() {
        return farmerRepository.findAll();
    }

    public Farmer addFarmer(Farmer farmer) {
        return farmerRepository.save(farmer);
    }
}

