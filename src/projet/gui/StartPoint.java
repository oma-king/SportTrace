/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.gui;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Oussama, Sana, Manel

 */


public class StartPoint extends Application {

    @Override
    public void start(Stage primaryStage) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("ProjectDashboard.fxml"));

            Scene scene = new Scene(root);

            primaryStage.setTitle("Sport Trace App");
            primaryStage.setScene(scene);
            primaryStage.getIcons().add(new Image("/Graphics/AppLogo.png"));
            scene.getStylesheets().add(getClass().getResource("/Graphics/AppCss/home.css").toExternalForm());
            primaryStage.initStyle(StageStyle.UNDECORATED);
            primaryStage.show();
        } catch (IOException ex) {
            Logger.getLogger(StartPoint.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
