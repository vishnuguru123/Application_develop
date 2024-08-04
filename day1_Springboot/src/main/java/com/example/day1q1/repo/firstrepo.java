package com.example.day1q1.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day1q1.model.firstmodel;





@Repository
public interface firstrepo extends JpaRepository<firstmodel,Integer>{

}
    

