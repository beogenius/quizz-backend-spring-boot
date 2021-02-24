package com.example.demo.model.repositories;


import com.example.demo.model.entities.AppGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppGroupRepository extends JpaRepository<AppGroup,Integer> {
}
