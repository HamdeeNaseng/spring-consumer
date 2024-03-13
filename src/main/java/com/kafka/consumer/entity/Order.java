package com.kafka.consumer.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.time.LocalDateTime;


@Entity
@Table(name = "orders")
@Setter
@Getter
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "order_author_id")
    private User placedBy; // More descriptive name

    @Column(name = "order_status")
    private String orderStatus;

    @Column(name = "order_created")
    private LocalDateTime orderCreated;

    @Column(name = "order_updated")
    private LocalDateTime orderUpdated;

    @ManyToOne
    @JoinColumn(name = "author_order_id") // Consider removing if redundant
    private User author;

    @ManyToMany(mappedBy = "orders") // 'mappedBy' references the field in the 'Item' entity
    private List<Items> items;
}