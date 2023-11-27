package com.tomcc.infohotel;


import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {

    double sidebarWidth;

    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        FlowPane root = new FlowPane();

        FlowPane sidebar = new FlowPane();
        sidebar.setPrefSize(130, 600);
        sidebar.setStyle("-fx-background-color: #a52323");

        sidebarWidth = sidebar.getPrefWidth();

        Label label = new Label("InfHotel");
        label.setPrefSize(sidebarWidth, 50);
        label.setStyle("-fx-background-color: #6b9bee; -fx-alignment: center; -fx-border-color: Black; -fx-border-width: 1 1 1 1; -fx-font-weight: Bold;");
        label.setAlignment(Pos.CENTER);

        VBox menu = new VBox();
        menu.setPrefSize(sidebarWidth, 300);
        menu.setStyle("-fx-background-color: #fff303;");




        menu.getChildren().addAll(getMenuItem("home"), getMenuItem("menu"), getMenuItem("bestelling"), getMenuItem("info"));
        sidebar.getChildren().addAll(label, menu);
        root.getChildren().add(sidebar);


        Scene scene = new Scene(root,1024, 600);


        stage.setTitle("infHotel");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public FlowPane getMenuItem(String title) {
        FlowPane menuItem = new FlowPane();
        menuItem.setPrefSize(sidebarWidth, sidebarWidth);
        menuItem.setStyle("-fx-background-color: #b700ff;");

        Pane sidePane = new Pane();
        sidePane.setPrefSize(5, sidebarWidth);
        sidePane.setStyle("-fx-background-color: #00ff9d;");

        Label menuItemLabel = new Label(title);
        menuItemLabel.setPrefSize(sidebarWidth - 6, sidebarWidth);
        menuItemLabel.setAlignment(Pos.CENTER);
        menuItemLabel.setStyle("-fx-text-fill: #fff");

        menuItem.getChildren().addAll(sidePane, menuItemLabel);
        return menuItem;
    }
}
