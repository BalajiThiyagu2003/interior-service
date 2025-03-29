package com.interiorservice.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interiorservice.model.Project;
import com.interiorservice.service.ProjectService;

@RestController
@RequestMapping("/projects")

public class ProjectController{
	
	private final ProjectService projectService;
	
	public ProjectController(ProjectService projectService) {
		this.projectService = projectService;
		
	}
	
	 @GetMapping
	    public List<Project> getAllProjects() {
	        return projectService.getAllProjects();
	    }
	
	 @GetMapping("/category/{categoryId}")
	    public ResponseEntity<List<Project>> getProjectsByCategory(@PathVariable Long categoryId) {
	        List<Project> projects = projectService.getProjectsByCategoryId(categoryId);
	        if (projects.isEmpty()) {
	            return ResponseEntity.notFound().build();
	        }
	        return ResponseEntity.ok(projects);
	    }

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
}