package com.inventorymanagement.dao;

import com.inventorymanagement.model.db.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;


@Transactional(readOnly = true)
public interface UserDao extends JpaRepository<User, Integer> {
    @Query("select p from User p where p.userName= ?1")
    User findByUsername(final String username);
}
