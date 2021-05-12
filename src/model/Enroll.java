public class Enroll {
    private int enrollID;
    private String memberID;
    private int credit;
    private String date;
    private int term;
    private int year;
    
    public Enroll() {
    }
    public Enroll(int enrollID, String memberID, int credit, String date, int term, int year) {
        this.enrollID = enrollID;
        this.memberID = memberID;
        this.credit = credit;
        this.date = date;
        this.term = term;
        this.year = year;
    }
    public int getEnrollID() {
        return enrollID;
    }
    public void setEnrollID(int enrollID) {
        this.enrollID = enrollID;
    }
    public String getMemberID() {
        return memberID;
    }
    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }
    public int getCredit() {
        return credit;
    }
    public void setCredit(int credit) {
        this.credit = credit;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public int getTerm() {
        return term;
    }
    public void setTerm(int term) {
        this.term = term;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    
}
