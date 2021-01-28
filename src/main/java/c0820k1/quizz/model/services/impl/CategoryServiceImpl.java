package c0820k1.quizz.model.services.impl;

import c0820k1.quizz.model.entities.Category;
import c0820k1.quizz.model.repositories.CategoryRepository;
import c0820k1.quizz.model.services.CategoryService;
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
    public Category delete(int id) {
        Category category = findById(id);
        categoryRepository.deleteById(id);
        return category;
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }
}
