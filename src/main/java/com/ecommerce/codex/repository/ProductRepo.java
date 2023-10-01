package com.ecommerce.codex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.codex.entity.Category;
import com.ecommerce.codex.entity.Product;
import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long> 
{
	  List<Product> findByName(String name);
	  List<Product> findByCategory(Category category);
}



