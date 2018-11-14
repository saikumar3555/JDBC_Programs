import java.sql.*;
import java.util.*;
public class JdbcExample08
{
  public static void main(String[] args)throws ClassNotFoundException,SQLException
  {
	Scanner s=new Scanner(System.in);
    Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	PreparedStatement ps=con.prepareStatement("select * from product11 where pcode=?");
	System.out.println("Enter the pcode");	
	String pcode=s.nextLine();
	ps.setString(1,pcode);
	ResultSet rs=ps.executeQuery();
	if(rs.next()){
	PreparedStatement ps2=con.prepareStatement("delete from product11 where pcode=?");
	
	
	//String pcode=s.nextLine();
	ps2.setString(1,pcode);
	int j=ps2.executeUpdate();
	if(j>=1){
	System.out.println("product details deleted");
	}
	}else{
		System.out.println("invalid product code");
		con.close();
		s.close();
   }
}}
  
  
  
  

  