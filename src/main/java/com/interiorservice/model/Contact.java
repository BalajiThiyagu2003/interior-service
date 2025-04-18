package com.interiorservice.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "contacts")
public class Contact {	

	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY )
	    private Long id;
		
		@Column(nullable=false)
	    private String fullName;
		
		@Column(nullable=false)
	    private String phoneNumber;
		
		@Column(nullable=false)
	    private String email;
		
		@Column(nullable=false)
	    private String message;
	    
		@Column(nullable = false, updatable = false)
		private LocalDateTime submittedAt; 
	    
		   @PrePersist
		    protected void onCreate() {
		        this.submittedAt = LocalDateTime.now();
		    }
	    
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getFullName() {
			return fullName;
		}
		public void setFullName(String fullName) {
			this.fullName = fullName;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public LocalDateTime getSubmittedAt() {
			return submittedAt;
		}
		public void setSubmittedAt(LocalDateTime submittedAt) {
			this.submittedAt = submittedAt;
		}

	    
	    
}