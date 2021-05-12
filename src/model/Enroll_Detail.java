public class Enroll_Detail {
    private int enrollID;
    private String subID;
    
    public Enroll_Detail() {
    }
    public Enroll_Detail(int enrollID, String subID) {
        this.enrollID = enrollID;
        this.subID = subID;
    }
    public int getEnrollID() {
        return enrollID;
    }
    public void setEnrollID(int enrollID) {
        this.enrollID = enrollID;
    }
    public String getSubID() {
        return subID;
    }
    public void setSubID(String subID) {
        this.subID = subID;
    }
    
} 
