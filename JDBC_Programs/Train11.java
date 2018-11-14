import java.sql.*;
import java.util.*;
public class Train11
{
  public static void main(String[] args)throws ClassNotFoundException,SQLException
  {
	Scanner s=new Scanner(System.in);
    Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	PreparedStatement ps=con.prepareStatement("insert into train11 values(?,?,?,?,?)");
	System.out.println("Enter no.of new trains");
	int n=Integer.parseInt(s.nextLine());
	for(int i=0;i<=n-1;i++){
	 System.out.println("Enter the Train number");	
	 String Tno=s.nextLine();
	 System.out.println("Enter the Train name");	
	 String Tname=s.nextLine();
	 System.out.println("Enter the from station");	
	 String frstation=s.nextLine();
	 System.out.println("Enter the To station");	
	 String tostation=s.nextLine();
	 System.out.println("Enter the no.of seats");	
	 int seats=Integer.parseInt(s.nextLine());
	 ps.setString(1,Tno);
	 ps.setString(2,Tname);
	 ps.setString(3,frstation);
	 ps.setString(4,tostation);
	 ps.setInt(5,seats);
	 int m=ps.executeUpdate();
	 if(m>=0){
		 System.out.println("Train details updated");
		 
	 }
	}
	con.close();
	s.close();	
	}
	
  
}  