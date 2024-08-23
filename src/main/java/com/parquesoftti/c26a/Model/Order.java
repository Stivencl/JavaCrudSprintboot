package com.parquesoftti.c26a.Model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "orders")
@AllArgsConstructor
@NoArgsConstructor

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
  private  Long orderId;
  private  Customer customers;
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
  private  Product product;

  private LocalDateTime orderDate;
  private  Integer quantity;
}