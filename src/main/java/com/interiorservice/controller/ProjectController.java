package com.interiorservice.controller;

import com.interiorservice.dto.ProjectRequest;
import com.interiorservice.model.Project;
import com.interiorservice.service.ProjectService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {

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

    @PostMapping("/add-project")
    public ResponseEntity<Project> addProject(@RequestBody ProjectRequest request) {
        
        return projectService.addProject(request);
    }

    
    
}
