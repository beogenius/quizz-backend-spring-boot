package c0820k1.quizz.model.services;

import java.util.List;

public interface CommonService<T> {
    List<T> getAll();
    T findById(int id);
    T delete(int id);
    T save(T t);
}
