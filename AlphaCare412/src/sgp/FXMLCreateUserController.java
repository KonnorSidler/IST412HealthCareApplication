
package sgp;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class FXMLCreateUserController extends FXMLLoginController implements Initializable{
    
    public FXMLCreateUserController() throws IOException, FileNotFoundException, ClassNotFoundException{
       super();
    }
    


    @FXML private Text actiontarget;
    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML protected void handleCreateButtonAction(ActionEvent event) throws IOException {
        
        long userID = (long) (Math.random() * 10000);
        String username = usernameField.getText();
        String password = passwordField.getText();
        System.out.println(username + password);

        
        
        //Creates new user in userlist.
        this.getUserListNav().getUserList().add(new User(userID, username, password));
        //Saves userlist to file with new user.
        this.getUserListNav().saveUserlist();
        Stage stage = (Stage) actiontarget.getScene().getWindow();
        Scene login = new Scene(FXMLLoader.load(getClass().getResource("FXMLLogin.fxml")), 350, 275);
        stage.setScene(login);
        stage.show();
    }
     @FXML protected void handleBackButtonAction(ActionEvent event) throws IOException {
        
        Stage stage = (Stage) actiontarget.getScene().getWindow();
        Scene login = new Scene(FXMLLoader.load(getClass().getResource("FXMLLogin.fxml")), 350, 275);
        stage.setScene(login);
        stage.show();
    }
       
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    
}

