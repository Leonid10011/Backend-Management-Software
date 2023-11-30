package com.example.gui_backend.controller;

import com.example.gui_backend.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainViewController {
    @FXML
    private Button manageUsersButton;

    @FXML
    private Button manageProductsButton;

    @FXML
    private void switchToManageUsersView(){
        Main.switchScene("ManageProductsView.fxml");
    }
}
