package com.example.ecomwebsite.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.Jar;

import java.math.BigDecimal;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String desc;
    private String brand;
    private String category;
    private BigDecimal price;
    private Date releaseData;
    private Boolean available;
    private int quantity;
    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageData;



//    INSERT INTO PRODUCT (name, desc, brand, price, category, release_datA, available, quantity) VALUES
//('Model S', 'A luxury all-electric sedan with impressive range.', 'Tesla', 79999.99, 'Sedan', '2022-06-10', TRUE, 15),
//            ('Mustang GT', 'A powerful sports car with a V8 engine.', 'Ford', 55999.99, 'Sports', '2021-09-05', TRUE, 10),
//            ('Civic', 'A reliable and fuel-efficient compact car.', 'Honda', 21999.99, 'Compact', '2023-02-15', TRUE, 25),
//            ('Camry', 'A comfortable midsize sedan with advanced safety features.', 'Toyota', 27999.99, 'Sedan', '2022-11-20', TRUE, 20),
//            ('X5', 'A luxurious and spacious SUV with cutting-edge technology.', 'BMW', 61999.99, 'SUV', '2022-08-30', TRUE, 8),
//            ('Model 3', 'An affordable all-electric sedan with autopilot features.', 'Tesla', 39999.99, 'Sedan', '2023-05-25', TRUE, 30),
//            ('F-150', 'A durable and high-performance pickup truck.', 'Ford', 49999.99, 'Truck', '2021-03-10', TRUE, 18),
//            ('Accord', 'A spacious and comfortable midsize sedan.', 'Honda', 25999.99, 'Sedan', '2022-07-15', TRUE, 22),
//            ('Highlander', 'A versatile and family-friendly SUV.', 'Toyota', 41999.99, 'SUV', '2021-12-05', TRUE, 12),
//            ('3 Series', 'A sporty and luxurious compact executive car.', 'BMW', 42999.99, 'Sedan', '2022-10-18', TRUE, 14);
//

}
