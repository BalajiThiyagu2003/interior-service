package com.interiorservice.service;

import com.interiorservice.model.Project;
import com.interiorservice.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProjectService{
	
	private final ProjectRepository projectRepository ;
	
	public ProjectService(ProjectRepository projectRepository) {
		
		this.projectRepository =projectRepository;
	}
	
	public List<Project> getAllProjects(){
		return projectRepository.findAll();
	}

	 public List<Project> getProjectsByCategoryId(Long categoryId) {
	        return projectRepository.findByCategoryId(categoryId);
	    }
}
