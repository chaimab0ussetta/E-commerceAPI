package com.ecommerce.codex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.codex.entity.Category;
import com.ecommerce.codex.repository.RepositoryCateg;

@Service
public class Categservice {
	

    @Autowired
    private RepositoryCateg categoryRepo;

    public void createCategory(Category category) {
    	categoryRepo.save(category);
    	
    }

    public List<Category> listCategory() {
        return categoryRepo.findAll();
    }

    public Category readCategory(String categoryName) {
		return categoryRepo.findByCategoryName(categoryName);
	}

}
