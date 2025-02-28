package com.example.milk_collection_service.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "milk_collections")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class MilkCollection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double quantity;
    private String collectionDate;

    private Long farmerId; // Reference to Farmer
}

