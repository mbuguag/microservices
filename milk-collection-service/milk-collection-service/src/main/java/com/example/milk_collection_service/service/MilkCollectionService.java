package com.example.milk_collection_service.service;


import com.example.milk_collection_service.client.FarmerClient;
import com.example.milk_collection_service.model.MilkCollection;
import com.example.milk_collection_service.repository.MilkCollectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MilkCollectionService {
    @Autowired
    private MilkCollectionRepository milkCollectionRepository;

    @Autowired
    private FarmerClient farmerClient;

    public List<MilkCollection> getAllMilkCollections() {
        return milkCollectionRepository.findAll();
    }

    public MilkCollection addMilkCollection(MilkCollection milkCollection) {
        // Check if farmer exists before saving
        farmerClient.getFarmerById(milkCollection.getFarmerId());
        return milkCollectionRepository.save(milkCollection);
    }
}

