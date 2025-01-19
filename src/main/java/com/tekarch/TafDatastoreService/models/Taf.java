package com.tekarch.TafDatastoreService.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data

public class Taf {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tafId;

    @Column(name = "user_name", nullable = false, unique = true, length = 20)
    private String tafUserName;

    @Column(name = "email", nullable = false, length = 50)
    private String tafEmail;

    @Column(name = "phone_number", columnDefinition = "VARCHAR(10) DEFAULT 'USD'")
    private String tafPhoneNumber;


    @Column(name = "created_at",columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;

    @Column(name = "updated_at",columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime updatedAt;


    @PrePersist
    public void prePersist()
    {
        this.createdAt= LocalDateTime.now();

    }
    @PreUpdate
    public void preUpdate() {
        this.updatedAt = LocalDateTime.now();
    }
}
