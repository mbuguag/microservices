package com.example.Farmer_Service.repository;


import com.example.Farmer_Service.model.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmerRepository extends JpaRepository<Farmer, Long> {
}

