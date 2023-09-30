package com.ecommerce.codex.repository;
import java.util.List;

import com.ecommerce.codex.entity.User;

public interface UserRepo {


    List<User> findAll();

    List<User> getUsersByTournament(int tournamentID);

    User getUserById(Long userId);

    User findByUsername(String username);

    int findIdByUsername(String username);

    boolean create(String username, String password, String role);
}