package com.example.demo.model.services.impl;

import com.example.demo.model.entities.AppGroup;
import com.example.demo.model.repositories.AppGroupRepository;
import com.example.demo.model.services.AppGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppGroupServiceImpl implements AppGroupService {
    @Autowired
    private AppGroupRepository appGroupRepository;
    @Override
    public List<AppGroup> getAll() {
        return appGroupRepository.findAll();
    }

    @Override
    public AppGroup findById(int id) {
        return appGroupRepository.findById(id).get();
    }

    @Override
    public boolean delete(int id) {
        if(findById(id) != null){
            return false;
        }
        appGroupRepository.deleteById(id);
        return true;
    }

    @Override
    public AppGroup save(AppGroup appGroup) {
        return appGroupRepository.save(appGroup);
    }
}
