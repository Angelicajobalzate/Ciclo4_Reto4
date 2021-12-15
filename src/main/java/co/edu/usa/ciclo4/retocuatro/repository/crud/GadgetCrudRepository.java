package co.edu.usa.ciclo4.retocuatro.repository.crud;

import co.edu.usa.ciclo4.retocuatro.model.Gadget;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Angélica Alzate
 */
public interface GadgetCrudRepository extends MongoRepository<Gadget,Integer>{
    
}
