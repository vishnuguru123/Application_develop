package com.example.day1q2.controller;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.day1q2.model.firstmodel;
import com.example.day1q2.service.firstservice;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;

@RestController

public class firstcontroller {
    

    @Autowired
    private firstservice projectService;
    
    @PostMapping("addproject")
    public String addProject( firstmodel model) {
        projectService.savedata(model);
        return "Project added successfully";
    }
    
    
    @GetMapping("/getdata")
    public List<firstmodel> getAllProjects() {
        return projectService.getAlldata();
    }
      
    
    @DeleteMapping("deletedata/{id}")
    public String deleteProject(@PathVariable("id") int project_id){
        if(projectService.get_project_id(project_id) != null){
            projectService.deletedata(project_id);
            return "Project deleted successfully";
        }
        return "No project found with the given ID";
    }
    
    @PutMapping("/updatedate/{id}/{date}")
    public String updateDate(@PathVariable int id, @PathVariable String date) {
        firstmodel oldData = projectService.get_project_id(id);
        if(oldData != null){
            oldData.setDate(date);
            projectService.savedata(oldData);
            return "Date Updated Successfully";
        }
        return "No data found";
}
}
