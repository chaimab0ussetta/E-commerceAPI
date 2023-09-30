package com.ecommerce.codex.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.codex.entity.Category;
import com.ecommerce.codex.service.Categservice;
import com.ecommerce.codex.config.APIconfigure;

import jakarta.validation.Valid;


	@RestController
	@RequestMapping("/catgory")
	public class CategController {

	    @Autowired
	    private Categservice categoryService;

	   
	    @PostMapping("/create")
		public ResponseEntity<APIconfigure> createCategory(@Valid @RequestBody Category category) {
			if (Objects.nonNull(categoryService.readCategory(category.getCategoryName()))) {
				return new ResponseEntity<APIconfigure>(new APIconfigure(false, "category already exists"), HttpStatus.CONFLICT);
			}
			categoryService.createCategory(category);
			return new ResponseEntity<>(new APIconfigure (true, "created the category"), HttpStatus.CREATED);
		}

	    @GetMapping("/list")
	    public List<Category> listCategory() {
	        return categoryService.listCategory();
	    }
	}

