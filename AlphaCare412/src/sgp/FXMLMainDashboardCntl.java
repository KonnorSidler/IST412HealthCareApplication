
package sgp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class FXMLMainDashboardCntl extends NavigationCntl implements Initializable {
    @FXML Label actiontarget;
    @FXML Text welcome;
    public FXMLMainDashboardCntl()  throws IOException, ClassNotFoundException{
       
    }
    
    @FXML protected void handleLogoutButtonAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) actiontarget.getScene().getWindow();
        Scene login = new Scene(FXMLLoader.load(getClass().getResource("FXMLLogin.fxml")), 350, 275);
        stage.setScene(login);
        stage.show();
    }
    
    @FXML protected void handleGradesButtonAction(ActionEvent event) throws IOException {
        
        Stage stage = (Stage) actiontarget.getScene().getWindow();
        stage.hide();
        this.changeSceneList(stage);
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        welcome.setText("");
    }  
    
   
    
}
