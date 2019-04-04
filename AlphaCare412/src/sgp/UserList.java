
package sgp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


public class UserList {
    public ArrayList<User> UserList;
    public Map<String, Double> gradeScale = new HashMap<String, Double>();;
    Properties properties = new Properties();
    public UserList() throws IOException, FileNotFoundException, ClassNotFoundException{
        UserList = this.loadUserlist();
        //UserList = new ArrayList<User>();
        //UserList.add(new User("ThomasT","admin1"));
         
         gradeScale.put("A", 4.00);
         gradeScale.put("A-", 3.67);
         gradeScale.put("B+", 3.33);
         gradeScale.put("B", 3.00);
         gradeScale.put("B-", 2.67);
         gradeScale.put("C+", 2.33);
         gradeScale.put("C", 2.00);
         gradeScale.put("D", 1.00);
         gradeScale.put("F", 0.00);
    }
    
            
    public User getUser(String username){
        int i = 0;
        System.out.println(username);
        for(int x=0;x<UserList.size();x++){
            
            if(UserList.get(x).getUsername().equals(username)){
                i= x;
            }
            
            }
        
        return UserList.get(i);
        
    }
    
    public ArrayList<User> getUserList(){
        return UserList;
    }
    public void createNewUser(String un, String pw){
        UserList.add(new User(un, pw));
    }
    public Double calculateGPA(String username){
        int totalCredits = 0;
        double totalGradePoints = 0;
        for(int i = 0; i < 20; i = i +4){
            totalCredits = totalCredits + (Integer.parseInt(this.getUser(username).getUserClassesAndGrades().get(i + 1)));
            totalGradePoints = totalGradePoints + (gradeScale.get(this.getUser(username).getUserClassesAndGrades().get(i + 3)) * Double.parseDouble(this.getUser(username).getUserClassesAndGrades().get(i + 1)));
        }
        double GPA = Math.round((totalGradePoints / totalCredits)*100.0)/100.0;
        
    return GPA;
    }
    
    
    
    
    
    public Map getGradeScale(){
        return gradeScale;
    }
    //Does saving and loading of ArrayList from file.
    public void saveUserlist() throws FileNotFoundException, IOException{
        FileOutputStream fos = new FileOutputStream("t.tmp");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(UserList);
        oos.close();
    }
    public ArrayList<User> loadUserlist() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream("t.tmp");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<User> UserList = (ArrayList<User>) ois.readObject();
        ois.close();
        return UserList;

    }
    
}

