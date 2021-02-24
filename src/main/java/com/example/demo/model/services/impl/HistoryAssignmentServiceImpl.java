package com.example.demo.model.services.impl;

import com.example.demo.model.entities.HistoryAssignment;
import com.example.demo.model.repositories.HistoryAssignmentRepository;
import com.example.demo.model.services.HistoryAssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryAssignmentServiceImpl implements HistoryAssignmentService {
    @Autowired
    private HistoryAssignmentRepository historyAssignmentRepository;
    @Override
    public List<HistoryAssignment> getAll() {
        return historyAssignmentRepository.findAll();
    }

    @Override
    public HistoryAssignment findById(int id) {
        return historyAssignmentRepository.findById(id).get();
    }

    @Override
    public boolean delete(int id) {
        if(findById(id) != null){
            return false;
        }
        historyAssignmentRepository.deleteById(id);
        return true;
    }

    @Override
    public HistoryAssignment save(HistoryAssignment historyAssignment) {
        return historyAssignmentRepository.save(historyAssignment);
    }
}
