package co.edu.usa.ciclo4.retocuatro.repository.crud;

import co.edu.usa.ciclo4.retocuatro.model.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Angélica Alzate
 */
public interface UserCrudRepository extends MongoRepository<User, Integer> {

    public Optional<User> findByEmail(String email);

    public Optional<User> findByEmailAndPassword(String email, String password);

//Para seleccionar el usuario con el id maximo
    Optional<User> findTopByOrderByIdDesc();
}
