package com.github.sgblug.app.repository;

import com.github.sgblug.app.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 20312
 * @author 2022/8/16 15:03
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
