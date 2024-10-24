package com.ijse.salesystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ijse.salesystem.entity.Category;
import com.ijse.salesystem.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService{
    
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategoryById(Long id){
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public Category createCategory(Category category){
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Long id,Category category){
        Category existingCategory = categoryRepository.findById(id).orElse(null);
        if(existingCategory == null){
            return null;
        }else{
            existingCategory.setName(category.getName());
            return categoryRepository.save(existingCategory);
        }
    }

    @Override
    public void deleteCategory(Long id){
        categoryRepository.deleteById(id);
    }
}
