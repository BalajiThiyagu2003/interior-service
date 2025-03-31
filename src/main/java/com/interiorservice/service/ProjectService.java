package com.interiorservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.interiorservice.dto.ProjectRequest;
import com.interiorservice.model.Category;
import com.interiorservice.model.Project;
import com.interiorservice.model.ProjectImage;
import com.interiorservice.repository.CategoryRepository;
import com.interiorservice.repository.ProjectImageRepository;
import com.interiorservice.repository.ProjectRepository;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;
    private final CategoryRepository categoryRepository;
    private final ProjectImageRepository projectImageRepository;

    public ProjectService(ProjectRepository projectRepository, CategoryRepository categoryRepository, ProjectImageRepository projectImageRepository) {
        this.projectRepository = projectRepository;
        this.categoryRepository = categoryRepository;
        this.projectImageRepository = projectImageRepository;
    }

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public List<Project> getProjectsByCategoryId(Long categoryId) {
        return projectRepository.findByCategoryId(categoryId);
    }

	public ResponseEntity<Project> addProject(ProjectRequest request) {
		Project project = new Project();
        project.setName(request.getName());
        project.setDescription(request.getDescription());
        project.setImageUrl(request.getImageUrl());

        Optional<Category> categoryOptional = categoryRepository.findById(request.getCategoryId());
        if (categoryOptional.isEmpty()) {
            throw new RuntimeException("Category not found with ID: " + request.getCategoryId());
        }

        project.setCategory(categoryOptional.get());
        Project savedProject = projectRepository.save(project);

        if (request.getImageUrls() != null && !request.getImageUrls().isEmpty()) {
            for (String url : request.getImageUrls()) {
                ProjectImage image = new ProjectImage();
                image.setProject(savedProject);  
                image.setImageUrl(url.trim());
                projectImageRepository.save(image);
            }
        }
        return ResponseEntity.ok(savedProject);
	}


}
