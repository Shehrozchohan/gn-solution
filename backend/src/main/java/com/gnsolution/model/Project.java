package com.gnsolution.model;

import java.time.LocalDateTime;

public class Project {
    private Long id;
    private String title;
    private String description;
    private String techStack;
    private String repoUrl;
    private String demoUrl;
    private Long developerId;
    private LocalDateTime createdAt;

    public Project() {}

    public Project(Long id, String title, String description, String techStack, String repoUrl, String demoUrl, Long developerId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.techStack = techStack;
        this.repoUrl = repoUrl;
        this.demoUrl = demoUrl;
        this.developerId = developerId;
        this.createdAt = LocalDateTime.now();
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getTechStack() { return techStack; }
    public void setTechStack(String techStack) { this.techStack = techStack; }

    public String getRepoUrl() { return repoUrl; }
    public void setRepoUrl(String repoUrl) { this.repoUrl = repoUrl; }

    public String getDemoUrl() { return demoUrl; }
    public void setDemoUrl(String demoUrl) { this.demoUrl = demoUrl; }

    public Long getDeveloperId() { return developerId; }
    public void setDeveloperId(Long developerId) { this.developerId = developerId; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}