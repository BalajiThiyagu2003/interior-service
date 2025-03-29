package com.interiorservice.service;

import com.interiorservice.model.Category;
import com.interiorservice.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService{
	private final CategoryRepository CategoryRepository;
	
	public CategoryService (CategoryRepository CategoryRepository) {
	
			this.CategoryRepository = CategoryRepository;
			
	}
	
	public List<Category>getAllCategory(){
		return CategoryRepository.findAll();
	}
	
	public Optional<Category> getCategoryById(Long id){
		return CategoryRepository.findById(id);
		
	}
	
	
	public Category addCategory(Category category) {
		if (CategoryRepository.existsByName(category.getName())) {
			throw new RuntimeException("Category with name '"+category.getName()+"Already exists.");
		}
		return CategoryRepository.save(category);
	}
	
	  public Category updateCategory(Long id, Category categoryDetails) {
	        return CategoryRepository.findById(id).map(category -> {
	            category.setName(categoryDetails.getName());
	            category.setDescription(categoryDetails.getDescription());
	            category.setImageUrl(categoryDetails.getImageUrl());
	            return CategoryRepository.save(category);
	        }).orElseThrow(() -> new RuntimeException("Category not found"));
	    }
	  
	  public void deleteCategory(Long id) {
	        if (!CategoryRepository.existsById(id)) {
	            throw new RuntimeException("Category not found");
	        }
	        CategoryRepository.deleteById(id);
	    }
}
