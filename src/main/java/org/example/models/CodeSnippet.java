package org.example.models;

import java.time.LocalDateTime;

public class CodeSnippet {
    private Long id;
    private String title;
    private String code;
    private String language;
    private LocalDateTime createdAt;

    public CodeSnippet(String title, String code, String language) {
        this.title = title;
        this.code = code;
        this.language = language;
        this.createdAt = LocalDateTime.now();
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }
    public LocalDateTime getCreatedAt() { return createdAt; }
}