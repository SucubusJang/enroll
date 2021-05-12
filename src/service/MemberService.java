import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
               
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
