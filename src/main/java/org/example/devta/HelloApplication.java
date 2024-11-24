package org.example.devta;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.control.Tab;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import org.controlsfx.control.StatusBar;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        // Cria o painel de abas principal
        TabPane tabPane = new TabPane();

        // Aba de Tarefas
        Tab taskTab = new Tab("Tarefas");
        VBox taskBox = new VBox(10); // 10 é o espaçamento
        taskBox.setPadding(new Insets(10));
        Button addTaskButton = new Button("Nova Tarefa");
        Label taskLabel = new Label("Lista de Tarefas");
        taskLabel.getStyleClass().add("title-label");

        // Adiciona os elementos na aba de tarefas
        taskBox.getChildren().addAll(taskLabel, addTaskButton);
        taskTab.setContent(taskBox);
        taskTab.setClosable(false);

        // Aba de Snippets
        Tab snippetTab = new Tab("Snippets de Código");
        VBox snippetBox = new VBox(10);
        snippetBox.setPadding(new Insets(10));
        Button addSnippetButton = new Button("Novo Snippet");
        Label snippetLabel = new Label("Biblioteca de Códigos");
        snippetLabel.getStyleClass().add("title-label");

        // Adiciona os elementos na aba de snippets
        snippetBox.getChildren().addAll(snippetLabel, addSnippetButton);
        snippetTab.setContent(snippetBox);
        snippetTab.setClosable(false);

        // Adiciona as abas ao painel principal
        tabPane.getTabs().addAll(taskTab, snippetTab);

        // Cria a barra de status
        StatusBar statusBar = new StatusBar();
        statusBar.setText("Pronto");

        // Cria o layout principal
        VBox root = new VBox(tabPane, statusBar);
        VBox.setVgrow(tabPane, javafx.scene.layout.Priority.ALWAYS);

        // Cria a cena
        Scene scene = new Scene(root, 800, 600);

        // Configura a janela principal
        stage.setTitle("DevTa - Gerenciador de Desenvolvimento");
        stage.setScene(scene);

        // Define ações dos botões
        addTaskButton.setOnAction(e -> {
            // TODO: Implementar adição de tarefa
            statusBar.setText("Adicionando nova tarefa...");
        });

        addSnippetButton.setOnAction(e -> {
            // TODO: Implementar adição de snippet
            statusBar.setText("Adicionando novo snippet de código...");
        });

        // Mostra a janela
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}