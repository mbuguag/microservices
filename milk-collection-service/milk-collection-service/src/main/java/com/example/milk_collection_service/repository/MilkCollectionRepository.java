package com.example.milk_collection_service.repository;


import com.example.milk_collection_service.model.MilkCollection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MilkCollectionRepository extends JpaRepository<MilkCollection, Long> {
}

