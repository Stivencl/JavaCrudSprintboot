package com.parquesoftti.c26a.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Setter
@Getter
@Table(name = "customers")
@AllArgsConstructor
@NoArgsConstructor

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String customerName;
    private String email;
    private String phoneNumber;

}
