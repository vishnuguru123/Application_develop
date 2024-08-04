package com.example.day1q2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day1q2.model.firstmodel;
import com.example.day1q2.repo.firstrepo;
import java.util.List;

@Service
public class firstservice {


    @Autowired
    private static firstrepo  firstrepo;
    public firstmodel savedata(firstmodel model){
        return firstrepo.save(model);
    }
    public firstmodel get_project_id(int id){
        return  firstrepo.findById(id).orElse(null);
    }
    public List<firstmodel>getAlldata()
    {
        return firstrepo.findAll();
    }
    public void deletedata(int id){
        firstrepo.deleteById(id);
    }
    public Object get_pid(int project_id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'get_pid'");
    }
}
