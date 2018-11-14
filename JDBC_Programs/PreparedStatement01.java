import java.sql.*;
import java.util.*;
public class PreparedStatement01
{
	public static void main(String[] args)throws ClassNotFoundException,SQLException
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the pcode");
	    String pcode=s.nextLine();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		PreparedStatement pstm=con.prepareStatement("select * from product11 where Pcode=?");
		pstm.setString(1,pcode);
		ResultSet rs=pstm.executeQuery();
		if(rs.next()){
			System.out.println("pcode "+rs.getString(1)+
			"\nPname "+rs.getString(2)+"\npprice "+rs.getFloat(3)+"\npqty "+rs.getInt(4));
		}
		else{
		System.out.println("invalid pcode");}
		con.close();
	}
	
	
}