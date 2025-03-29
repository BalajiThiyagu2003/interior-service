package com.interiorservice.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name="projects")
public class Project{
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(nullable = false,length =225)
	private String name;
	
	@Column(columnDefinition = "TEXT")
	private String description;
	
	@Column(name = "image_url")
	private String imageUrl;
	
	
	@ManyToOne
	@JoinColumn(name = "category_id",nullable=false)
	private Category category;
	
	
	@Column(name = "created_at", updatable =false)
	private LocalDateTime CreatedAt;
	
	@PrePersist
	protected void onCreate() {
		this.CreatedAt = LocalDateTime.now();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public LocalDateTime getCreatedAt() {
		return CreatedAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		CreatedAt = createdAt;
	}
	
	
	
	
}