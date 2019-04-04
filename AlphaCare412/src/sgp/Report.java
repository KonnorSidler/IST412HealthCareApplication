
package healthcaresystem;
import java.util.HashMap;
/**
 * The Report class will consist of createReport, viewReport, and editReport public functions
 * 
 */


public class Report {
    
    /**
     * createReport() method, creates a report of a patient
     * @return returns true if report successfully created, false if not.
     */
    
    private String reportText;
    private String date;
    private int reportID;
    private HashMap<String, Integer> reportValueMap;
    
    public Report(String reportText, String date, int reportID) {
        this.date = date;
        this.reportID = reportID;
        this.reportText = reportText;
        System.out.println("Report created");
    }

  
    
    
    
    /**
     * 
     * @param patient
     * @return returns all information in this report about user.
     */
    public void viewReport() {
        System.out.println("Report ID: " + this.reportID);
        System.out.println("Date: " + this.date);
        System.out.println("Report:\n" + this.reportText);
    }
    
    /**
     * @return Returns true if report is successfully updated, false if not.
     */
    public Boolean editReport(String date, String reportText, int reportID) {
        try {
            this.date = date;
            this.reportID = reportID;
            this.reportText = reportText;
            return true;
        }
        catch(Exception ex) {
            ex.printStackTrace();
            return false;
        }  
    }
    
    public void populateValueFromForm(HashMap<String, Integer> valueMap) {
        reportValueMap = valueMap;
    }
    
    public HashMap<String, Integer> getValueMap() {
        return reportValueMap;
    }
    
    
        
    
}