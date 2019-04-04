
package sgp;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ezk5274
 */
public class User implements Serializable {
    private long userID;
    private String username;
    private String password;
    private ArrayList<String> userClassesAndGrades;
    
    
    public User(long newUserID, String newusername, String newpassword){
        userID = newUserID;
        username = newusername;
        password = newpassword;
    }
    
    public String getUsername(){
        return username;
    }
    public String getPassword() {
        return password;
    }
    public ArrayList<String> getUserClassesAndGrades(){
        return userClassesAndGrades;
    }
    
    

    
}
