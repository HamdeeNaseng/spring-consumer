package com.kafka.consumer.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kafka.consumer.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    
}
