package com.gulshan.ecom.service.category;

import com.gulshan.ecom.entity.Category;

import java.util.List;

public interface CategoryServiceInterface {
    Category getCategoryById(Long id);

    Category getCategoryByName(String name);

    List<Category> getAllCategories();

    Category addCategory(Category category);

    Category updateCategory(Category category, Long id);

    void deleteCategoryById(Long id);
}
