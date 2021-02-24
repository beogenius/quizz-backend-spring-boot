package com.example.demo.model.repositories;


import com.example.demo.model.entities.HistoryAssignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryAssignmentRepository extends JpaRepository<HistoryAssignment,Integer> {
}
