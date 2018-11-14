import java.sql.*;
//import java.sql.PrepareStatement;
public class Book11Program
{
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdb:oracle:thin:@localhost:1521:XE","hr","hr");
		PreparedStatement stm=con.PrepareStatement("insert into book11 values(?,?,?,?,?)");
		stm.setInt(1,60);
		stm.String(2,"GS");
		stm.String(3,"sreedahr");
		stm.setInt(4,1060);
		stm.setInt(5,2);
	int i=stm.executeUpdate();
	System.out.println(i+"rows edited ");
		//ResultSet rs=stm.executeQuery("select * from book11");
		/*while(rs.next()){
			System.out.println( rs.getInt(1)+"     "+rs.getString(2)+"     "+rs.getString(3)+"    "+rs.getInt(4)+rs.getInt(5));
		}*/
		con.close();              
		
	}
}