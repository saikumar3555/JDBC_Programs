import java.sql.*;
import java.util.*;
public class JdbcExample07
{
  public static void main(String[] args)throws ClassNotFoundException,SQLException
  {
	Scanner s=new Scanner(System.in);
    Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	PreparedStatement ps=con.prepareStatement("select * from Book11 where bcode=?");
	System.out.println("Enter the bcode");	
	int bcode=Integer.parseInt(s.nextLine());
	ps.setInt(1,bcode);
	ResultSet rs=ps.executeQuery();
	if(rs.next()){
	PreparedStatement ps2=con.prepareStatement("update book11 set bprice=? where bcode=?");
	System.out.println("old book price: "+rs.getFloat(4));
	System.out.println("Enter new Book price");
	float bprice=Float.parseFloat(s.nextLine());
	ps2.setFloat(1,bprice);
	int j=ps2.executeUpdate();
	if(j>1){
	System.out.println("book price updated");
	}
	}else{
		System.out.println("invalid book code");
		con.close();
		s.close();
   }
  }
  
  
  
  
}
  