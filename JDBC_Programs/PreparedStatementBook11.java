import java.sql.*;
import java.util.*;
public class PreparedStatementBook11
{
	public static void main(String[] args)throws ClassNotFoundException,SQLException
  {
	  Scanner s=new Scanner(System.in);
	  System.out.println("enter bcode");
	  int bcode=s.nextInt();
	  System.out.println("enter bname");
	  String bname=s.nextLine();
	  System.out.println("enter bauthor");
	  String bauthor=s.nextLine();
	  
	  System.out.println("enter bprice");
	  float bprice=s.nextFloat();
	  System.out.println("enter bqty");
	  int bqty=s.nextInt();
	  
	  Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	  PreparedStatement ps=con.prepareStatement("insert into Book11 values(?,?,?,?,?)");
	  ps.setInt(1,bcode);
	  ps.setString(2,bname);
	  ps.setString(3,bauthor);
	  ps.setFloat(4,bprice);
	  ps.setInt(5,bqty);
	  
	  
	  //ps.setInt(1,10);
	  //ps.setString(2,"MM");
	  //ps.setString(3,"vamshi");
	  //ps.setDouble(4,12);
	  //ps.setInt(5,3);
	  int k=ps.executeUpdate();
	  if(k>0){
		  System.out.println("row inserted...");
	  }
  }
}