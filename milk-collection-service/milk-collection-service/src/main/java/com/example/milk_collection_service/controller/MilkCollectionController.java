package com.example.milk_collection_service.controller;


import com.example.milk_collection_service.model.MilkCollection;
import com.example.milk_collection_service.service.MilkCollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/milk-collections")
public class MilkCollectionController {
    @Autowired
    private MilkCollectionService milkCollectionService;

    @GetMapping
    public List<MilkCollection> getMilkCollections() {
        return milkCollectionService.getAllMilkCollections();
    }

    @PostMapping
    public MilkCollection addMilkCollection(@RequestBody MilkCollection milkCollection) {
        return milkCollectionService.addMilkCollection(milkCollection);
    }
}

