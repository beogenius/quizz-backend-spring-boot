package com.example.demo.model.repositories;


import com.example.demo.model.entities.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<Exam,Integer> {
}
