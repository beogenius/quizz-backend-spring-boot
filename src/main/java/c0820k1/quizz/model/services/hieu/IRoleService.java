package c0820k1.quizz.model.services.hieu;


import c0820k1.quizz.model.entities.Role;

import java.util.Optional;

public interface IRoleService extends IGeneralService<Role> {
    Optional<Role> findByName(String name);
}
