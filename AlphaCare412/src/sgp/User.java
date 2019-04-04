
package sgp;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ezk5274
 */
public class User implements Serializable {
    private String username;
    private String password;
    private ArrayList<String> userClassesAndGrades;
    
    
    public User(String newusername, String newpassword){
        username = newusername;
        password = newpassword;
        String[] classes = {"IST 311", "IST 331", "CAS 100A", "ENGL 15", "IST 110", "IST 230", "IST 210", 
            "IST 220", "ENGL 202D", "IST 301", "SOC 119", "CAMS 5", "CAMS 33", "CYBER 262", "SRA 221", "IST 450"};
        userClassesAndGrades = new ArrayList<String>(10);
        int gradeNumber = (int) Math.round((Math.random() * ((100-60) + 1) + 60));
        int courseNumber = (int) Math.round(Math.random() * (14 + 1));
        int i = 0;
        
        //While i is less than 5 (or the number of classes) the loop runs and tries to add a class
        while(i < 5){
            if(!userClassesAndGrades.contains(classes[courseNumber])){
                userClassesAndGrades.add(classes[courseNumber]);
                userClassesAndGrades.add(Integer.toString((int) Math.round((Math.random() * (2 + 1)) +1)));
                userClassesAndGrades.add(Integer.toString(gradeNumber));
                userClassesAndGrades.add(this.getGradeLetter(gradeNumber));
                
                i++;
            }
            gradeNumber = (int) Math.round((Math.random() * ((100-60) + 1) + 60));
            courseNumber = (int) Math.round(Math.random() * (9 + 1));
        }
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
    
    public String getGradeLetter(int gradeNumber){
        String gradeLetter = "F";
        if(gradeNumber >= 60){
            gradeLetter = "D-";
            if(gradeNumber >= 63){
                gradeLetter = "D";
                if(gradeNumber >= 70){
                    gradeLetter = "C";
                    if(gradeNumber >= 77){
                        gradeLetter = "C+";
                        if(gradeNumber >= 80){
                            gradeLetter = "B-";
                            if(gradeNumber >= 83){
                                gradeLetter = "B";
                                if(gradeNumber >= 87){
                                    gradeLetter = "B+";
                                    if(gradeNumber >= 90){
                                        gradeLetter = "A-";
                                        if(gradeNumber >= 93){
                                            gradeLetter = "A";
                                            }
                                    }}}}}}}}
        return gradeLetter;
    }

    
}
