package com.shop.dao;

import com.shop.web.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserDao extends CrudRepository<User, Long> {
    List<User> findByEmail(String email);

    List<User> findByRole(String Role);
}
