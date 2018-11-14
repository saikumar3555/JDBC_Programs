import java.sql.*;
public class AdvJavaDemo
{
	public static void main(String[] args)throws ClassNotFoundException,SQLException
	{
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	  Connection con=DriverManager.getConnection("jdb:oracle:thin:@localhost:1521:XE","hr","hr");
	  Statement stm=con.createStatement();
	  ResultSet rs=stm.executeQuery("select* from employee11");
	  while(rs.next())
	  {
		System.out.println(rs.getString(1)+" "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getInt(4)+"  "+rs.getInt(5));
	
	  }
	    con.close();             
	}
}                                                                                                                     