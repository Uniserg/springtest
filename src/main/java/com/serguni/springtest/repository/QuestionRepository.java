package com.serguni.springtest.repository;

import com.serguni.springtest.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
