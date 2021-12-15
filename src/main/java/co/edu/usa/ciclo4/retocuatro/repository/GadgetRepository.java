package co.edu.usa.ciclo4.retocuatro.repository;

import co.edu.usa.ciclo4.retocuatro.model.Gadget;
import co.edu.usa.ciclo4.retocuatro.repository.crud.GadgetCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Angélica Alzate
 */
@Repository
public class GadgetRepository {
    
    @Autowired
    private GadgetCrudRepository gadgetCrudRepository;
    
    public List<Gadget> getAll(){
        return gadgetCrudRepository.findAll();
    }
    
    public Optional<Gadget> getGadget(int id){
        return gadgetCrudRepository.findById(id);
    }
    
    public Gadget save(Gadget gadget){
        return gadgetCrudRepository.save(gadget);
    }
    
   /* public void update (Gadget gadget){
        gadgetCrudRepository.save(gadget);
    }*/
    
    public void delete(Gadget gadget){
        gadgetCrudRepository.delete(gadget);
    }
}
