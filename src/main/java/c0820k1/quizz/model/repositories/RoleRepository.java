package c0820k1.quizz.model.repositories;

import c0820k1.quizz.model.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Integer> {
    //Hieu
    Optional<Role> findByName(String name);
}
