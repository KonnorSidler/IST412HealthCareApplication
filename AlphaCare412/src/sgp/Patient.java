
package sgp;

import java.util.ArrayList;

/**
 *
 * @author Eric Kinner
 */
public class Patient extends User {
    private String patientName;
    // private ArrayList<Report> patientReportList;
    
    public Patient(long newUserId, String username, String password) {
        super(newUserId, username, password);
        
    }
    
    
    

    
    public String getpatientName() {
        return patientName;
    }

    
}
