package com.kafka.consumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kafka.consumer.entity.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    
}
