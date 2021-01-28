package c0820k1.quizz.model.services.impl;

import c0820k1.quizz.model.entities.AppGroup;
import c0820k1.quizz.model.repositories.AppGroupRepository;
import c0820k1.quizz.model.services.AppGroupService;
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
    public AppGroup delete(int id) {
        AppGroup appGroup = findById(id);
        appGroupRepository.deleteById(id);
        return appGroup;
    }

    @Override
    public AppGroup save(AppGroup appGroup) {
        return appGroupRepository.save(appGroup);
    }
}
