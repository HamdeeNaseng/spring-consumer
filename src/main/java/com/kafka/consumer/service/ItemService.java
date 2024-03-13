package com.kafka.consumer.service;

import org.springframework.stereotype.Service;

import com.kafka.consumer.entity.Items;
import com.kafka.consumer.repository.ItemRepository;

@Service
public class ItemService {
    private final ItemRepository itemRepository;
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Items save(Items item) {
        return itemRepository.save(item);
    }

}
