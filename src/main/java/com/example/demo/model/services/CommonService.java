package com.example.demo.model.services;

import java.util.List;

public interface CommonService<T> {
    List<T> getAll();
    T findById(int id);
    boolean delete(int id);
    T save(T t);
}
