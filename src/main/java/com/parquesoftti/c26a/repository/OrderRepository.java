package com.parquesoftti.c26a.repository;

import com.parquesoftti.c26a.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.border.Border;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
}
