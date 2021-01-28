package c0820k1.quizz.model.services.impl;

import c0820k1.quizz.model.entities.Role;
import c0820k1.quizz.model.repositories.RoleRepository;
import c0820k1.quizz.model.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
    public Role delete(int id) {
        Role role = findById(id);
        roleRepository.deleteById(id);
        return role;
    }

    @Override
    public Role save(Role role) {
        return roleRepository.save(role);
    }
}
