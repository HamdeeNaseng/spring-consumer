package com.kafka.consumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kafka.consumer.entity.Items;
@Repository
public interface ItemRepository extends JpaRepository<Items, Long> {

    
} 