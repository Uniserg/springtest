package com.serguni.springtest.repository;

import com.serguni.springtest.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {
}
