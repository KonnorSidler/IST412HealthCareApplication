/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Thomas
 */
public class FXMLDoctorController implements Initializable {

    @FXML
    private Button BackButtonAction;
    @FXML
    private TableView<?> Table;
    @FXML
    private TableColumn<?, ?> patientname;
    @FXML
    private TableColumn<?, ?> gradeCol;
    @FXML
    private Label actiontarget;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleBackButtonAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) actiontarget.getScene().getWindow();
        Scene login = new Scene(FXMLLoader.load(getClass().getResource("FXMLMainDash.fxml")), 350, 275);
        stage.setScene(login);
        stage.show();
    }
    
}
