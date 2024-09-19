package com.example.blogging.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.blogging.Repository.CategoryRepository;
import com.example.blogging.dto.CategoryDto;
import com.example.blogging.entity.Category;
import com.example.blogging.entity.Post_x_category;

import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

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
        categoryInfo.setPost_x_category(categoryDto.getPost_x_category());
        return categoryRepository.save(categoryInfo);
    }

    public boolean updateCategory(Long id, CategoryDto categoryDto) {
        Optional<Category> optionalCategory = categoryRepository.findById(id);
        if (optionalCategory.isPresent()) {
            Category categoryToUpdate = optionalCategory.get();
            categoryToUpdate.setName_category(categoryDto.getName_category());
            categoryToUpdate.setPost_x_category(categoryDto.getPost_x_category());
            categoryRepository.save(categoryToUpdate);
            return true;
        } else {
            return false;
        }
    }
}
