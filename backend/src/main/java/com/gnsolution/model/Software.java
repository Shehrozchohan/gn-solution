package com.gnsolution.model;

import java.time.LocalDateTime;

public class Software {
    private Long id;
    private String name;
    private String version;
    private String category;
    private String description;
    private String downloadUrl;
    private String iconClass;
    private LocalDateTime lastUpdated;

    public Software() {}

    public Software(Long id, String name, String version, String category, String description, String downloadUrl, String iconClass) {
        this.id = id;
        this.name = name;
        this.version = version;
        this.category = category;
        this.description = description;
        this.downloadUrl = downloadUrl;
        this.iconClass = iconClass;
        this.lastUpdated = LocalDateTime.now();
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getVersion() { return version; }
    public void setVersion(String version) { this.version = version; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getDownloadUrl() { return downloadUrl; }
    public void setDownloadUrl(String downloadUrl) { this.downloadUrl = downloadUrl; }

    public String getIconClass() { return iconClass; }
    public void setIconClass(String iconClass) { this.iconClass = iconClass; }

    public LocalDateTime getLastUpdated() { return lastUpdated; }
    public void setLastUpdated(LocalDateTime lastUpdated) { this.lastUpdated = lastUpdated; }
}