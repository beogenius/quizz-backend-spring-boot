package c0820k1.quizz.model.repositories;

import c0820k1.quizz.model.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
