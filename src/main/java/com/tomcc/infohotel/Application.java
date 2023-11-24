package com.tomcc.infohotel;


import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        FlowPane root = new FlowPane();

        FlowPane sidebar = new FlowPane();
        sidebar.setPrefSize(200, 600);
        sidebar.setStyle("-fx-background-color: #a52323");

        double sidebarWidth = sidebar.getPrefWidth();
        Label label = new Label("InfHotel");
        label.setPrefSize(sidebarWidth, 50);
        label.setStyle("-fx-background-color: #6b9bee; -fx-alignment: center; -fx-border-color: Black; -fx-border-width: 1 1 1 1; -fx-font-weight: Bold;");
        label.setAlignment(Pos.CENTER);

        root.getChildren().add(sidebar);
        sidebar.getChildren().add(label);

        Scene scene = new Scene(root,1024, 600);





        stage.setTitle("infHotel");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}