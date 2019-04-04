/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Got help for some of our code via https://www.youtube.com/watch?v=uh5R7D_vFto
 */

package sgp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FXMLlistCntl extends NavigationCntl implements Initializable {

    @FXML Button BackButtonAction;
    
    public FXMLlistCntl() throws IOException, ClassNotFoundException {
        super();
        
    }
    public class patient {
        public SimpleStringProperty patientname = new SimpleStringProperty();

        public String getpatientname() {
            return patientname.get();
        }

    }
 

    @FXML TableView<patient> Table;
    @FXML TableColumn patientnameCol;
    @FXML TableColumn creditsCol;
    @FXML TableColumn gradeCol;
    @FXML TableColumn gradeletterCol;
    ObservableList<patient> data;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML protected void handleBackButtonAction(ActionEvent event) throws IOException {

        Stage stage = (Stage) BackButtonAction.getScene().getWindow();
        Scene mainDash = new Scene(FXMLLoader.load(getClass().getResource("FXMLMainDash.fxml")), 450, 525);
        stage.setScene(mainDash);
        stage.show();
    }
    
    }
    
   

