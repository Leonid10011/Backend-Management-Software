package com.example.gui_backend.controller.view;

import com.example.gui_backend.controller.api.CategoryController;
import com.example.gui_backend.model.Category;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.util.Callback;

import java.util.List;

public class ManageCategory {

    @FXML
    public ListView<String> listView = new ListView<>();

    @FXML
    public void initialize(){
        List<Category> categories = CategoryController.getAllCategories();
        ObservableList<String> listItems = FXCollections.observableArrayList();

        categories.forEach(category -> {listItems.add(category.getName());});

        listView.setItems(listItems);

        listView.setCellFactory(new Callback<ListView<String>, ListCell<String>>() {
            @Override
            public ListCell<String> call(ListView<String> listView) {
                return new ListCell<String>(){
                    private final Button buttonUpdate = new Button("Update");
                    private final Button buttonDelete = new Button("Delete");
                    private final HBox content;

                    private final Region spacer =  new Region();

                    {
                        Label textLabel = new Label();
                        textLabel.textProperty().bind(itemProperty());
                        content = new HBox();
                        content.getChildren().addAll(textLabel,spacer, buttonUpdate, buttonDelete);
                        content.setSpacing(10);

                        HBox.setHgrow(spacer, Priority.ALWAYS);


                        content.setFillHeight(true);

                        buttonUpdate.setOnAction(event -> System.out.println("Update!"));
                        buttonDelete.setOnAction(event -> System.out.println("Delete!"));

                        //content.setStyle("-fx-background-color: #ffffff;");
                    }

                    @Override
                    protected void updateItem(String item, boolean empty){
                        super.updateItem(item, empty);
                        if(item != null && !empty){
                            setGraphic(content);
                        } else {
                            setGraphic(null);
                        }
                    }
                };
            }
        });
    }
}
