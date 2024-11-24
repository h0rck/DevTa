package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Criar o TabPane principal
        TabPane tabPane = new TabPane();

        // Aba de Tarefas
        Tab tasksTab = new Tab("Tarefas");
        tasksTab.setClosable(false);
        VBox tasksBox = new VBox(10);
        Button addTaskButton = new Button("Adicionar Tarefa");
        tasksBox.getChildren().addAll(
                new Label("Suas Tarefas:"),
                addTaskButton
        );
        tasksTab.setContent(tasksBox);

        // Aba de Snippets
        Tab snippetsTab = new Tab("Snippets");
        snippetsTab.setClosable(false);
        VBox snippetsBox = new VBox(10);
        Button addSnippetButton = new Button("Adicionar Snippet");
        snippetsBox.getChildren().addAll(
                new Label("Seus Snippets de Código:"),
                addSnippetButton
        );
        snippetsTab.setContent(snippetsBox);

        // Aba de Notas
        Tab notesTab = new Tab("Notas");
        notesTab.setClosable(false);
        VBox notesBox = new VBox(10);
        Button addNoteButton = new Button("Adicionar Nota");
        notesBox.getChildren().addAll(
                new Label("Suas Notas:"),
                addNoteButton
        );
        notesTab.setContent(notesBox);

        // Adicionar todas as abas ao TabPane
        tabPane.getTabs().addAll(tasksTab, snippetsTab, notesTab);

        // Criar a cena principal
        Scene scene = new Scene(tabPane, 800, 600);

        // Configurar a janela
        primaryStage.setTitle("DevTa - Gerenciador de Tarefas");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}