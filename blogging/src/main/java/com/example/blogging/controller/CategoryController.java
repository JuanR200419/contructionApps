package com.example.blogging.controller;

import com.example.blogging.services.CategoryService;
import com.example.blogging.dto.CategoryDto;
import com.example.blogging.entity.Category;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public Category findById(@PathVariable Long id) {
        return categoryService.findById(id).orElse(null);
    }

    @PostMapping
    public Category createCategory(@Valid @RequestBody CategoryDto categoryDto) {
        return categoryService.createCategory(categoryDto);
    }

    @PutMapping("/{id}")
    public boolean updateCategory(@Valid  @PathVariable Long id, @RequestBody CategoryDto categoryDto) {
        return categoryService.updateCategory(id, categoryDto);
    }

    @DeleteMapping("/{id}")
    public boolean deleteCategory(@PathVariable Long id) {
        return categoryService.deleteCategory(id);
    }
}
