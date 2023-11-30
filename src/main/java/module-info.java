module com.example.gui_backend {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;

    opens com.example.gui_backend to javafx.fxml;
    exports com.example.gui_backend;

    opens com.example.gui_backend.controller to javafx.fxml;
    exports com.example.gui_backend.controller;
}