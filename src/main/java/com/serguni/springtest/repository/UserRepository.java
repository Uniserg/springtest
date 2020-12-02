package com.serguni.springtest.repository;

import com.serguni.springtest.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
