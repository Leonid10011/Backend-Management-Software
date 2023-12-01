package com.example.gui_backend.controller.view;

import com.example.gui_backend.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ManageProducts {
    @FXML
    private Button manageCategoryButton = new Button();

    @FXML
    public void switchToCategoryView(){
        Main.switchScene("ManageCategoryView.fxml");
    }
}
