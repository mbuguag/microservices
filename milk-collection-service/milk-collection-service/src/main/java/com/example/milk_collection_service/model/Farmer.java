package com.example.milk_collection_service.model;



import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "farmers")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Farmer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String phoneNumber;
}


