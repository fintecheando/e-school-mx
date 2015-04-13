package com.mx.itzamna.eschoolmx.repository;

import org.springframework.data.repository.CrudRepository;
import com.mx.itzamna.eschoolmx.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByEmail(String email);
}
