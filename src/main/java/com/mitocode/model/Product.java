package com.mitocode.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    private Integer id;

    @Column(nullable = false, length = 30)
    private String name;

    @Column(nullable = false)
    private boolean status;
}
