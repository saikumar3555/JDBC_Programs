import java.util.*;
import java.sql.*;
public class DbCollection
{
	public static void main(String[] args)throws ClassNotFoundException,SQLException
	{
		ArrayList<BookData> al=new ArrayList<BookData>();//Collection object
		Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		PreparedStatement ps=con.prepareStatement("select * from book11");
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			al.add(new BookData(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getFloat(4),rs.getInt(5)));
		}//end of while
		System.out.println("----Dis from ArrayList-----(java7) ");
		Iterator it=al.iterator();
		while(it.hasNext()){
		System.out.println((BookData)it.next());}
			
			System.out.println("----Dis from ArrayList-----(java8) ");
			Iterator it2=al.iterator();
			it2.forEachRemaining((k)->
			{
				System.out.println(k);
			});
		}
	}
