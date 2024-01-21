package com.ecomerceApi.Priscila.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    @Table(name = "product")
    public class Product {

        @Id
        @Column(name = "product_id")
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int productId;

        @Column(name = "product_name")
        private String productName;

        @Column
        private String description;

        @Column
        private Double price;

        @Column(name = "stock_quantity")
        private int stockQuantity;

        @Column(name = "is_stored")
        private boolean stored;

        @ManyToOne
        @JoinColumn(name = "seller_id")
        private User seller;


}