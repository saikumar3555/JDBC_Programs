import java.sql.*;
import java.util.*;
public class RetriveDataUsingBookCode
{
	public static void main(String[] args)throws ClassNotFoundException,SQLException
	{ 
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter book code");
	 String bcode=s.nextLine();
	 
	 Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	 PreparedStatement ps=con.prepareStatement("select* from book11 where bcode=?");
	 ps.setString(1,bcode);
	 ResultSet rs=ps.executeQuery();
	 if(rs.next()){
		System.out.println( 
		  "bcode       "+rs.getString(1)
		 +"\nbname     "+rs.getString(2)
		 +"\nbauthor   "+rs.getString(3)
		 +"\nbprice    "  +rs.getFloat(4)
		 +"\nbqty      "  +rs.getInt(5));
	 }else{
	 System.out.println("invalid bcode");}
	 con.close();
	 s.close();
	 
	 
	 
	}
}
