module org.example.devta {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;
    requires java.sql;

    opens org.example.devta to javafx.fxml;
    exports org.example.devta;
    exports org.example.controllers;
    exports org.example.models;
    opens org.example.controllers to javafx.fxml;
}