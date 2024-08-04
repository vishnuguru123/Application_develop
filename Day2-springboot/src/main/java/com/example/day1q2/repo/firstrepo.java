package com.example.day1q2.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.day1q2.model.firstmodel;
public class firstrepo {
    


@Repository
public interface HelperRepository extends JpaRepository<firstmodel,Integer>{

}

public void deleteById(int id) {
    
    throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
}

public List<firstmodel> findAll() {
    
    throw new UnsupportedOperationException("Unimplemented method 'findAll'");
}

public Object findById(int id) {
    
    throw new UnsupportedOperationException("Unimplemented method 'findById'");
}

public firstmodel save(firstmodel model) {
    
    throw new UnsupportedOperationException("Unimplemented method 'save'");
}
    
}
