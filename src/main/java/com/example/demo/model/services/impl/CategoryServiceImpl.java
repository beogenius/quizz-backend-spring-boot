package com.example.demo.model.services.impl;

import com.example.demo.model.entities.Category;
import com.example.demo.model.repositories.CategoryRepository;
import com.example.demo.model.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findById(int id) {
        return categoryRepository.findById(id).get();
    }

    @Override
    public boolean delete(int id) {
        if(findById(id) != null){
            return false;
        }
        categoryRepository.deleteById(id);
        return true;
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }
}
