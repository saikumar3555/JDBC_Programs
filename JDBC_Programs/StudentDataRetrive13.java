import java.util.Scanner;
import java.sql.*;
public class StudentDataRetrive13
{
  public static void main(String[] args)throws SQLException,ClassNotFoundException
  {
   Scanner s=new Scanner(System.in);
   System.out.println("Enter Student RoolNumber(Integer)");
   int rollnumber=s.nextInt();
   Class.forName("oracle.jdbc.driver.OracleDriver");  
   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
   CallableStatement cs=con.prepareCall("{call StudentData13(?,?,?,?,?,?,?,?,?,?)}");
   cs.setInt(1,rno);
   cs.registerOutParameter(2,Types.String);
   cs.registerOutParameter(3,Types.String);
   cs.registerOutParameter(4,Types.INTEGER);
   cs.registerOutParameter(5,Types.String);
   cs.registerOutParameter(6,Types.String);
   cs.registerOutParameter(7,Types.INTEGER);
   cs.registerOutParameter(8,Types.INTEGER);
   cs.registerOutParameter(9,Types.INTEGER);
   cs.registerOutParameter(10,Types.String);
   cs.execute();
   System.out.println("Name: "+getString(2));
   System.out.println("Branch: "+getString(3));
   System.out.println("HouseNo: "+getInt(4));
   System.out.println("Student Name: "+getString(5));
   System.out.println("City : "+getString(6));
   System.out.println("Phone Number: "+getInt(7));
   System.out.println("TotalMarks: "+getInt(8));
   System.out.println("Percentage: "+getInt(9));
   System.out.println("Result: "+getString(10));
   con.close();
   s.close();
  }
}