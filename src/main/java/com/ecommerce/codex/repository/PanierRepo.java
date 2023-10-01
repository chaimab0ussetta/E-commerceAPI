package com.ecommerce.codex.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.codex.entity.Panier;
import com.ecommerce.codex.entity.User;

@Repository
public interface PanierRepo extends JpaRepository<Panier, Integer>  {
	
	    // find all the products saved to wishlist for a user
	    // sort by latest created date
	
	    List<Panier> findAllByUserOrderByCreatedDateDesc(User user);

	}

