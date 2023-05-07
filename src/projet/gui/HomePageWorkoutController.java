/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import projet.entities.workout;
import projet.services.workoutMETIER;
import java.util.stream.Collectors;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Oussama, Sana, Manel
 */
public class HomePageWorkoutController implements Initializable {

    ObservableList<String> listW;
    ObservableList<workout> listWd;
    @FXML
    private TextField tfHnbr_series;
    @FXML
    private TextField tfHduree_serie;
    @FXML
    private TextArea tfHdesciption;
    @FXML
    private Button btnRetour;
    @FXML
    private Button btwTansitionGRUDW;
    @FXML
    private AnchorPane listview;
    @FXML
    private ListView<String> ListW_arms;
    @FXML
    private ListView<String> ListW_back;
    @FXML
    private ListView<String> ListW_legs;
    @FXML
    private ListView<String> ListW_glutes;
    @FXML
    private ListView<String> ListW_shoulders;
    @FXML
    private ListView<String> ListW_abdominals;
    @FXML
    private Pane backgroundPane;
    @FXML
    private Pane detailsPane;

    public void workoutDetails() {
        workoutMETIER wm = new workoutMETIER();

        if (!ListW_arms.hasProperties()) {
            listW = wm.showWorkoutByMuscle("arms");
            ListW_arms.setItems(listW);
        }
        if (!ListW_shoulders.hasProperties()) {
            listW = wm.showWorkoutByMuscle("shoulders");
            ListW_shoulders.setItems(listW);
        }
        if (!ListW_back.hasProperties()) {
            listW = wm.showWorkoutByMuscle("back");
            ListW_back.setItems(listW);
        }
        if (!ListW_legs.hasProperties()) {
            listW = wm.showWorkoutByMuscle("legs");
            ListW_legs.setItems(listW);
        }
        if (!ListW_glutes.hasProperties()) {
            listW = wm.showWorkoutByMuscle("glutes");
            ListW_glutes.setItems(listW);
        }
        if (!ListW_abdominals.hasProperties()) {
            listW = wm.showWorkoutByMuscle("abdominals");
            ListW_abdominals.setItems(listW);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        workoutDetails();
        tfHdesciption.setWrapText(true);

    }

    @FXML
    private void afficherWorkoutDetailsArms(MouseEvent event) {
        workoutMETIER wm = new workoutMETIER();
        listWd = wm.showWorkoutByMuscleDetails(ListW_arms.getSelectionModel().getSelectedItem());
        tfHnbr_series.setText(listWd.stream().map(workout::getNbr_series).collect(Collectors.toList()).toString().replace("[", "").replace("]", ""));
        tfHduree_serie.setText(listWd.stream().map(workout::getDuree_serie).collect(Collectors.toList()).toString().replace("[", "").replace("]", ""));
        tfHdesciption.setText(listWd.stream().map(workout::getDescription).collect(Collectors.toList()).toString().replace("[", "").replace("]", ""));
    }

    @FXML
    private void afficherWorkoutDetailsBack(MouseEvent event) {
        workoutMETIER wm = new workoutMETIER();
        listWd = wm.showWorkoutByMuscleDetails(ListW_back.getSelectionModel().getSelectedItem());
        tfHnbr_series.setText(listWd.stream().map(workout::getNbr_series).collect(Collectors.toList()).toString().replace("[", "").replace("]", ""));
        tfHduree_serie.setText(listWd.stream().map(workout::getDuree_serie).collect(Collectors.toList()).toString().replace("[", "").replace("]", ""));
        tfHdesciption.setText(listWd.stream().map(workout::getDescription).collect(Collectors.toList()).toString().replace("[", "").replace("]", ""));
    }

    @FXML
    private void afficherWorkoutDetailsLegs(MouseEvent event) {
        workoutMETIER wm = new workoutMETIER();
        listWd = wm.showWorkoutByMuscleDetails(ListW_legs.getSelectionModel().getSelectedItem());
        tfHnbr_series.setText(listWd.stream().map(workout::getNbr_series).collect(Collectors.toList()).toString().replace("[", "").replace("]", ""));
        tfHduree_serie.setText(listWd.stream().map(workout::getDuree_serie).collect(Collectors.toList()).toString().replace("[", "").replace("]", ""));
        tfHdesciption.setText(listWd.stream().map(workout::getDescription).collect(Collectors.toList()).toString().replace("[", "").replace("]", ""));
    }

    @FXML
    private void afficherWorkoutDetailsGlutes(MouseEvent event) {
        workoutMETIER wm = new workoutMETIER();
        listWd = wm.showWorkoutByMuscleDetails(ListW_glutes.getSelectionModel().getSelectedItem());
        tfHnbr_series.setText(listWd.stream().map(workout::getNbr_series).collect(Collectors.toList()).toString().replace("[", "").replace("]", ""));
        tfHduree_serie.setText(listWd.stream().map(workout::getDuree_serie).collect(Collectors.toList()).toString().replace("[", "").replace("]", ""));
        tfHdesciption.setText(listWd.stream().map(workout::getDescription).collect(Collectors.toList()).toString().replace("[", "").replace("]", ""));
    }

    @FXML
    private void afficherWorkoutDetailsShoulders(MouseEvent event) {
        workoutMETIER wm = new workoutMETIER();
        listWd = wm.showWorkoutByMuscleDetails(ListW_shoulders.getSelectionModel().getSelectedItem());
        tfHnbr_series.setText(listWd.stream().map(workout::getNbr_series).collect(Collectors.toList()).toString().replace("[", "").replace("]", ""));
        tfHduree_serie.setText(listWd.stream().map(workout::getDuree_serie).collect(Collectors.toList()).toString().replace("[", "").replace("]", ""));
        tfHdesciption.setText(listWd.stream().map(workout::getDescription).collect(Collectors.toList()).toString().replace("[", "").replace("]", ""));
    }

    @FXML
    private void afficherWorkoutDetailsAbdominals(MouseEvent event) {
        workoutMETIER wm = new workoutMETIER();
        listWd = wm.showWorkoutByMuscleDetails(ListW_abdominals.getSelectionModel().getSelectedItem());
        tfHnbr_series.setText(listWd.stream().map(workout::getNbr_series).collect(Collectors.toList()).toString().replace("[", "").replace("]", ""));
        tfHduree_serie.setText(listWd.stream().map(workout::getDuree_serie).collect(Collectors.toList()).toString().replace("[", "").replace("]", ""));
        tfHdesciption.setText(listWd.stream().map(workout::getDescription).collect(Collectors.toList()).toString().replace("[", "").replace("]", ""));
    }

    @FXML
    private void retourhomeNavigation(ActionEvent event) {
        Stage stage = (Stage) btnRetour.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void crudNavigation(ActionEvent event) throws IOException {

        Parent WcrudParent = FXMLLoader.load(getClass().getResource("ShowWorkout.fxml"));
        
        ScrollPane WcrudScene = new ScrollPane(WcrudParent);
        
        
       /* Scene WcrudScene = new Scene(WcrudParent);*/
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
      //set Stage boundaries to visible bounds of the main screen
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
       window.setScene(new Scene(WcrudScene, primaryScreenBounds.getWidth(), primaryScreenBounds.getHeight()));
       window.setX(primaryScreenBounds.getMinX());
       window.setY(primaryScreenBounds.getMinY());
        WcrudScene.getStylesheets().add(getClass().getResource("/Graphics/AppCss/ShowWorkout.css").toExternalForm());
        window.show();

    }

}
