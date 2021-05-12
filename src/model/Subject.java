public class Subject {
    private String subID;
    private String name;
    private int credti;
    private int sec;
    private String date;
    private String memberID;
    
    public Subject() {
    }
    public Subject(String subID, String name, int credti, int sec, String date, String memberID) {
        this.subID = subID;
        this.name = name;
        this.credti = credti;
        this.sec = sec;
        this.date = date;
        this.memberID = memberID;
    }
    public String getSubID() {
        return subID;
    }
    public void setSubID(String subID) {
        this.subID = subID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCredti() {
        return credti;
    }
    public void setCredti(int credti) {
        this.credti = credti;
    }
    public int getSec() {
        return sec;
    }
    public void setSec(int sec) {
        this.sec = sec;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getMemberID() {
        return memberID;
    }
    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }
    
}
