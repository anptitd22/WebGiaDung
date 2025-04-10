package com.example.demo.models.product;

import com.example.demo.models.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 255)
    private String name;

//    @ManyToOne
//    @JoinColumn(name = "product_price_id")
//    private ProductPrice productPrice;

//    @ManyToOne
//    @JoinColumn(name = "category_id")
//    private Category category;

    @Column(name = "stock")
    private Long stock;

    @Column(name = "description")
    private String description;

    @Column(name = "brand")
    private String brand;

    @Column(name = "rating")
    private Float rating;

    @Column(name = "end_at")
    private LocalDateTime endAt;
}
