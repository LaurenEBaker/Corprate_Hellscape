package com.corporate.hellscape;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;

public class JavaFXApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent game = FXMLLoader.load(getClass().getResource("Game.fxml"));
		primaryStage.setTitle("Corporate Hellscape");
		primaryStage.setScene(new Scene(game));
		primaryStage.show();
    }
}