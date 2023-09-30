package com.ecommerce.codex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ecommerce.codex.entity.Category;

@Repository
public interface RepositoryCateg extends JpaRepository<Category, Integer> {
	Category findByCategoryName(String categoryName);

}
