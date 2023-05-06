/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.gui;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Oussama, Sana, Manel
 */
public class HomePageDashboardController implements Initializable {

    @FXML
    private Pane logoPane;
    @FXML
    private ImageView LogoHomeDashboard;
    @FXML
    private Pane HomeBackgroundPane;
    @FXML
    private Pane backgroundPane;
    @FXML
    private Button Contactus;
    @FXML
    private Button FacebookPage;
    @FXML
    private Text T1;
    @FXML
    private Text T2;
    @FXML
    private Text T3;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Called to initialize a controller after its root element has been completely processed.
    	//Parameters:
    		//location - The location used to resolve relative paths for the root object, or null if the location is not known.
    		//resources - The resources used to localize the root object, or null if the root object was not localized.
    }    

    @FXML
    private void ContactUsTransition(ActionEvent event) throws URISyntaxException, IOException  {
          Desktop.getDesktop().browse(new URI("https://www.facebook.com/messages/t/100891118624659"));
    }

    @FXML
    private void FacebookTransition(ActionEvent event) throws URISyntaxException, IOException {
         Desktop.getDesktop().browse(new URI("https://www.facebook.com/profile.php?id=100064315862989"));
    }
    
}
