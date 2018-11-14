import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.util.Scanner;
public class Transaction
{
	public static void main(String[] args)throws SQLException,ClassNotFoundException
    {
	 Class.forName("oracle.jdbc.driver.OracleDriver");  
     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
      con.setAutoCommit(false);
	  Savepoint s1=con.setSavepoint();
	  PreparedStatement ps=con.prepareStatement("update bank13 set bal=bal+? where accno=?");
	  ps.setDouble(1,-5000);
	  ps.setInt(2,1001);
	  int i=ps.executeUpdate();
	  ps.setDouble(1,5000);
	  ps.setInt(2,1002);
      int j=ps.executeUpdate();
	  if(i==1 && j==1)
	  {
		  con.commit();
		  System.out.println("Transaction succesful...");
	  }else{
		  con.rollback();
		  System.out.println("Transaction Failed...");
	  
	  }
    }
}