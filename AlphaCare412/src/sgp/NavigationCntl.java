
package sgp;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NavigationCntl{
    public static UserList userlist;
    public static User currentUser;
    
    public NavigationCntl() throws IOException, ClassNotFoundException {
        userlist = new UserList();
    }
    public void changeSceneMainDashboard(Stage stage) throws IOException{
        Scene mainDash = new Scene(FXMLLoader.load(getClass().getResource("FXMLMainDash.fxml")), 450, 525);
        stage.setScene(mainDash);
        stage.show();
    }
    public void changeSceneCreateUser(Stage stage) throws IOException{
        Scene createUser = new Scene(FXMLLoader.load(getClass().getResource("FXMLCreateUser.fxml")), 350, 275);
        stage.setScene(createUser);
        stage.show();
    }
    public void changeSceneList(Stage stage) throws IOException{
        Scene grades = new Scene(FXMLLoader.load(getClass().getResource("FXMLDoctorView.fxml")), 600, 400);
        stage.setScene(grades);
        stage.show();
    }

    public UserList getUserListNav(){
        return userlist;
    }
    public void setCurrentUser(String user){
        currentUser = userlist.getUser(user);
    }
    public String getCurrentUsername(){
        return currentUser.getUsername();
    }
    public User getCurrentUser(){
        return currentUser;
    }
}
