package com.example.day1q1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day1q1.model.firstmodel;
import com.example.day1q1.repo.firstrepo;
import java.util.List;

@Service
public class firstservice {


    @Autowired
    private static firstrepo helperRepository;
    public firstmodel savedata(firstmodel model){
        return helperRepository.save(model);
    }
    public firstmodel get_project_id(int id){
        return helperRepository.findById(id).orElse(null);
    }
    public List<firstmodel>getAlldata()
    {
        return helperRepository.findAll();
    }
    public void deletedata(int id){
        helperRepository.deleteById(id);
    }

    public Object get_pid(int project_id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'get_pid'");
    }
}
