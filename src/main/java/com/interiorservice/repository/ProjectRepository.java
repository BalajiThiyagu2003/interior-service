package com.interiorservice.repository;

import com.interiorservice.model.Project;
import com.interiorservice.model.ProjectImage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long>{
	List<Project> findByCategoryId(Long categoryId);

	void save(ProjectImage image);
}

