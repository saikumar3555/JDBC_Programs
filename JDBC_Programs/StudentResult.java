import java.util.*;
import java.sql.*;
public class StudentResult
{
	public static void main(String[]args)throws ClassNotFoundException,SQLException
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the rno ");
		String rno=s.nextLine();
		System.out.println("Enter the name ");
		String name=s.nextLine();
		System.out.println("Enter the br ");
		String br=s.nextLine();
		System.out.println("Enter the phno ");
		Long phno=Long.praseLong(s.nextLine());
		System.out.println("Enter the mid ");
		String mid=s.nextLine();
		System.out.println("Enter the addr ");
		String addr=s.nextLine();
		System.out.println("Enter the pincode ");
		int pincode=Integer.parseint(s.nextLine());
		System.out.println("Enter the marks ");
		int marks=Integer.parseint(s.nextLine());
		System.out.println("Enter the per ");
		int per=Integer.parseFloat(s.nextLine());
		System.out.println("Enter the Result ");
		String result=s.nextLine();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		PreparedStatement ps=con.prepareStatement("insert into StudentResult values(?,?,?,?,?,?,?,?,?,?)");
		ps.setString(1,rno);
		ps.setString(2,name);
		ps.setString(3,br);
		ps.setlong(4,phno);
		ps.setString(5,mid);
		ps.setString(6,addr);
		ps.setint(7,pincode);
		ps.setint(8,marks);
		ps.setint(8,per);
		ps.setString(9,result);
		int k=ps.executeUpdate();
		if(k>0){
		System.out.println("student Result is updated");
		}

	}
}