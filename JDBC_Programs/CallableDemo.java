import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.*;
public class CallableDemo
{
 public static void main(String[] args)throws ClassNotFoundException,SQLException
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the accNo(int)");
  int accNo=Integer.parseInt(s.nextLine());
  System.out.println("Enter the accType ");
  String accType=s.nextLine();
  System.out.println("Enter the custname ");
  String custname=s.nextLine();
  System.out.println("Enter the amt(int) ");
  int amt=Integer.parseInt(s.nextLine());
  System.out.println("Enter the addr ");
  String addr=s.nextLine();
  System.out.println("Enter the phno ");
  String phno=s.nextLine();
  
  Class.forName("oracle.jdbc.driver.OracleDriver");  
  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
  CallableStatement cs=con.prepareCall("{call CreateAccount13(?,?,?,?,?,?)}");
  cs.setInt(1,accNo);
  cs.setString(2,accType);
  cs.setString(3,custname);
  cs.setInt(4,amt);
  cs.setString(5,addr);
  cs.setString(6,phno);
  cs.execute();
  System.out.println("Account Created....");
  con.close();
  s.close();
 }
}