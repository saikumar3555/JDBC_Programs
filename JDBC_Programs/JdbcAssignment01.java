import java.sql.*;
import java.util.*;
public class JdbcAssignment01
{
 public static void main(String[] args)throws ClassNotFoundException,SQLException
 {
  Scanner s=new Scanner(System.in);
  Class.forName("oracle.jdbc.driver.OracleDriver");
  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
  PreparedStatement ps=con.prepareStatement("select * from userreg11 where uname=? and pword=?");
  System.out.println("Enter user name");
  String userid=s.nextLine();
  ps.setString(1,userid);
  System.out.println("enter password");
  String pword=s.nextLine();
  ps.setString(1,pword);
  ResultSet rs=ps.executeQuery();
  if(rs.next()){
    PreparedStatement ps2=con.prepareStatement("update userreg11 set phno=? where uname=? and pword=? ");
	System.out.println("old mobile number"+rs.getInt(6));
	System.out.println("enter new mobile number");
	long phno=Long.parseLong(s.nextLine());
	ps2.setLong(1,phno);
	int j=ps2.executeUpdate();
	if(j>=1){
	System.out.println("phone number updated succesfully....");
	}
	}else{
		System.out.println("invalid username or password");
		con.close();
	    s.close();}
 }
}
