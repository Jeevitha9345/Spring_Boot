package com.example.OrderEx.Repository;

import com.example.OrderEx.Entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<OrderEntity,Long> {
}
