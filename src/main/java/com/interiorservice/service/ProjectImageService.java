package com.interiorservice.service;

import com.interiorservice.model.ProjectImage;
import com.interiorservice.repository.ProjectImageRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectImageService {

    private final ProjectImageRepository projectImageRepository;

    public ProjectImageService(ProjectImageRepository projectImageRepository) {
        this.projectImageRepository = projectImageRepository;
    }

    public List<ProjectImage> getImagesByProjectId(Long projectId) {
        return projectImageRepository.findByProjectId(projectId);
    }

    public ProjectImage saveImage(ProjectImage image) {
        return projectImageRepository.save(image);
    }

    public Optional<ProjectImage> getImageById(Long id) {
        return projectImageRepository.findById(id);
    }

    public void deleteImage(Long id) {
        projectImageRepository.deleteById(id);
    }
}
