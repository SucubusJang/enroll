public class Member {
    private String memberID;
    private String name;
    private String lastname;
    private String major;
    private String faculty;
    private String password;
    private String role;

    public Member() {}

    public Member(String memberID, String name, String lastname, String major, String faculty, String password,
            String role) {
        this.memberID = memberID;
        this.name = name;
        this.lastname = lastname;
        this.major = major;
        this.faculty = faculty;
        this.password = password;
        this.role = role;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
