package com.ecommerce.codex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.codex.entity.Panier;
import com.ecommerce.codex.entity.User;
import com.ecommerce.codex.repository.PanierRepo;

@Service
public class PanierService {
    @Autowired
    private PanierRepo panierRepo;

    public void createWishlist(Panier panier) {
    	panierRepo.save(panier);
    }

    public List<Panier> readWishList(User user) {
        return panierRepo.findAllByUserOrderByCreatedDateDesc(user);
    }
}
