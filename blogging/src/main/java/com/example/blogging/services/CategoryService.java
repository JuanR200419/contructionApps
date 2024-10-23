package com.example.blogging.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.blogging.repository.CategoryRepository;
import com.example.blogging.dto.CategoryDto;
import com.example.blogging.entity.Category;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }

    public boolean deleteCategory(Long id) {
        categoryRepository.deleteById(id);
        return true;
    }

    public Category searchCategory(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    public Category createCategory(CategoryDto categoryDto) {
        Category categoryInfo = new Category();
        categoryInfo.setName_category(categoryDto.getName_category());
        return categoryRepository.save(categoryInfo);
    }

    public boolean updateCategory(Long id, CategoryDto categoryDto) {
        Optional<Category> optionalCategory = categoryRepository.findById(id);
        if (optionalCategory.isPresent()) {
            Category categoryToUpdate = optionalCategory.get();
            categoryToUpdate.setName_category(categoryDto.getName_category());
            categoryRepository.save(categoryToUpdate);
            return true;
        } else {
            return false;
        }
    }
}
