module com.example.gui_backend {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;

    requires java.net.http;

    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.annotation;


    opens com.example.gui_backend to javafx.fxml;
    exports com.example.gui_backend;

    opens com.example.gui_backend.controller.api to javafx.fxml;
    exports com.example.gui_backend.controller.api;

    opens com.example.gui_backend.model to javafx.fxml;
    exports com.example.gui_backend.model;

    exports com.example.gui_backend.controller.view;
    opens com.example.gui_backend.controller.view to javafx.fxml;
}