package com.example.blogging.controller;

import com.example.blogging.services.CategoryService;
import com.example.blogging.dto.CategoryDto;
import com.example.blogging.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<Category> findAll() {
        return categoryService.findAll();
    }

    public Optional<Category> findById(Long id) {
        return categoryService.findById(id);
    }

    public boolean deleteCategory(Long id) {
        return categoryService.deleteCategory(id);
    }

    public Category createCategory(CategoryDto categoryDto) {
        return categoryService.createCategory(categoryDto);
    }

    public boolean updateCategory(Long id, CategoryDto categoryDto) {
        return categoryService.updateCategory(id, categoryDto);
    }
}
