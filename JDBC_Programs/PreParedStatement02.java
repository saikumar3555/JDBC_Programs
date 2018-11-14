import java.sql.*;
import java.util.*;
public class PreParedStatement02
{
	public static void main(String[]args)throws ClassNotFoundException,SQLException
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the uname ");
		String uname=s.nextLine();
		System.out.println("Enter the pword ");
		String pword=s.nextLine();
		System.out.println("Enter the fname ");
		String fname=s.nextLine();
		System.out.println("Enter the lname ");
		String lname=s.nextLine();
		System.out.println("Enter the addr ");
		String addr=s.nextLine();
		System.out.println("Enter the phno ");
		Long phno=Long.parseLong(s.nextLine());
		System.out.println("Enter the Mid ");
		String mid=s.nextLine();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		PreparedStatement pstm=con.prepareStatement("insert into UserReg11 values(?,?,?,?,?,?,?)");
		pstm.setString(1,uname);
		pstm.setString(2,pword);
		pstm.setString(3,fname);
		pstm.setString(4,lname);
		pstm.setString(5,addr);
		pstm.setLong(6,phno);
		pstm.setString(7,mid);
		int k=pstm.executeUpdate();
		if(k>0){
		System.out.println("user registration succesfulllll....");}
		con.close();
		s.close();
		
	}
	
}