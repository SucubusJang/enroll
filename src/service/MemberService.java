import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Member;
import utility.DBConnection;

public class MemberService {
    private ArrayList<Member> members = new ArrayList<Member>();

    public ArrayList<Member> getMember() {
        DBConnection db = new DBConnection();
        Connection cn = db.getConnection();
        String sql = "SELECT * FROM `member`";
        try {
            Statement statement = cn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                Member mem = new Member();
                mem.set
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
