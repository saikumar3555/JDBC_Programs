import java.sql.*;
import java.util.*;
public class InsertQueryDemo
{
	public static void main(String[] args)throws ClassNotFoundException,SQLException
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the query(creatr or insert)");
		String query=s.nextLine();
	    Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
	    Statement stm=con.createStatement();
		int k=stm.executeUpdate(query);
	    if(k>=0){
		System.out.println("updated database");}
	    con.close();             
	s.close();
	}
}                                                                                                                     