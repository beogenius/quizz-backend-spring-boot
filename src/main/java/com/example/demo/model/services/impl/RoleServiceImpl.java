package com.example.demo.model.services.impl;

import com.example.demo.model.entities.Role;
import com.example.demo.model.repositories.RoleRepository;
import com.example.demo.model.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public List<Role> getAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role findById(int id) {
        return roleRepository.findById(id).get();
    }

    @Override
    public boolean delete(int id) {
        if(findById(id) != null){
            return false;
        }
        roleRepository.deleteById(id);
        return true;
    }

    @Override
    public Role save(Role role) {
        return roleRepository.save(role);
    }
}
