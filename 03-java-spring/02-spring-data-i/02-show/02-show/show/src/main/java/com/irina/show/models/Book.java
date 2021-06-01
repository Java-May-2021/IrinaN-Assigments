package com.irina.show.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="books")

public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	
	@Size(min=1, max=15, message="Hey, your size is not right")
	private String name;
	
	@Size(min=1, max=15, message="Hey, your size is not right")
	private String description;
	
//	@NotEmpty for strings - don't use it
	@NotBlank
	private String language;
	
//	@NotNull // for numbers
//	@Min(1)
//	@Max(1000)
//	@Range(min=1, max=1000)
	private int noPages;
	
	@Column(updatable=false)
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date createdAt;
    @Column
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date updatedAt;
    
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
	
	public Book() {
	}
	
	

	public Book(@Size(min = 1, max = 15, message = "Hey, your size is not right") String name,
			@Size(min = 1, max = 15, message = "Hey, your size is not right") String description,
			@NotBlank String language, @NotNull @Min(1) @Max(1000) int noPages) {
		this.name = name;
		this.description = description;
		this.language = language;
		this.noPages = noPages;
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
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getNoPages() {
		return noPages;
	}
	public void setNoPages(int noPages) {
		this.noPages = noPages;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	

	
	
	

}
