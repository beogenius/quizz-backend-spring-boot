package c0820k1.quizz.model.services.hieu;

import c0820k1.quizz.model.entities.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface IUserService extends IGeneralService<User>, UserDetailsService {
    Optional<User> findByUsername(String username);

    boolean existsByUsername(String username);
}
