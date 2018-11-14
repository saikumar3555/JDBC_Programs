import java.sql.*;
import java.util.*;
public class LoginProgram
{
  public static void main(String[] args)throws ClassNotFoundException,SQLException
  {
	  Scanner s=new Scanner(System.in);
	  System.out.println("enter user name");
	  String uname=s.nextLine();
	  System.out.println("enter password");
	  String pword=s.nextLine();
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	 PreparedStatement ps=con.prepareStatement("select* from userreg11 where uname=? and pword=?");
	 //PreparedStatement ps=con.prepareStatement("select* from userreg11 where uname=?");
	  ps.setString(1,uname);
	  ps.setString(2,pword);
	  ResultSet rs=ps.executeQuery();
	  if(rs.next()){
		  System.out.println("user regstration succesfull");
	  }else{
	  System.out.println("Invalid username or password");}
	 
  }
}