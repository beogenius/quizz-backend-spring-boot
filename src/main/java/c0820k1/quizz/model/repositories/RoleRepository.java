package c0820k1.quizz.model.repositories;

import c0820k1.quizz.model.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Integer> {
}
