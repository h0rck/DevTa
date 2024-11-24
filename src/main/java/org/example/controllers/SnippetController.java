package org.example.controllers;

import org.example.models.CodeSnippet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class SnippetController {
    private ObservableList<CodeSnippet> snippets;

    public SnippetController() {
        snippets = FXCollections.observableArrayList();
    }

    public void addSnippet(CodeSnippet snippet) {
        snippets.add(snippet);
    }

    public ObservableList<CodeSnippet> getSnippets() {
        return snippets;
    }

    public void removeSnippet(CodeSnippet snippet) {
        snippets.remove(snippet);
    }
}