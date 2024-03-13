package com.kafka.consumer.service;

import org.springframework.stereotype.Service;

import com.kafka.consumer.entity.Category;
import com.kafka.consumer.repository.CategoryRepository;
@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category getCategoryById(Integer id) {
        return categoryRepository.findById(id).orElse(null);     
    }
}
