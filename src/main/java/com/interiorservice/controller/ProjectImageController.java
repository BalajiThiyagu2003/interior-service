package com.interiorservice.controller;

import com.interiorservice.model.ProjectImage;
import com.interiorservice.service.ProjectImageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/project-images")
public class ProjectImageController {

    private final ProjectImageService projectImageService;

    public ProjectImageController(ProjectImageService projectImageService) {
        this.projectImageService = projectImageService;
    }

    @GetMapping("/{projectId}")
    public ResponseEntity<List<ProjectImage>> getImagesByProjectId(@PathVariable Long projectId) {
        List<ProjectImage> images = projectImageService.getImagesByProjectId(projectId);
        return ResponseEntity.ok(images);
    }

    @PostMapping
    public ResponseEntity<ProjectImage> uploadImage(@RequestBody ProjectImage image) {
        ProjectImage savedImage = projectImageService.saveImage(image);
        return ResponseEntity.ok(savedImage);
    }

    @GetMapping("/image/{id}")
    public ResponseEntity<ProjectImage> getImageById(@PathVariable Long id) {
        Optional<ProjectImage> image = projectImageService.getImageById(id);
        return image.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteImage(@PathVariable Long id) {
        projectImageService.deleteImage(id);
        return ResponseEntity.noContent().build();
    }
}
