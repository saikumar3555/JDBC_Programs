import java.util.Scanner;
//import java.sql.*;
public class Use
{
  //static int totalmarks=0;
  //static String fc;
   public static void main(String[] args)
    {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the Roolnumber(integer)");
	 int Roolnumber=Integer.parseInt(s.nextLine());
	 System.out.println("Enter the student name");
	 String name=s.nextLine();
	 System.out.println("Enter the branch");
	 String branch=s.nextLine();
	 System.out.println("Enter the house number");
	 int hno=Integer.parseInt(s.nextLine());
	 System.out.println("Enter the street name");
	 String sname=s.nextLine();
	 System.out.println("Enter the city");
	 String city=s.nextLine();
	 System.out.println("Enter the pincode");
	 int pincode=Integer.parseInt(s.nextLine());
	 System.out.println("enter the all subjects marks");
	 System.out.println("CMC :");
	 int CMC=Integer.parseInt(s.nextLine());
	 System.out.println("RS :");
	 int RS=Integer.parseInt(s.nextLine());
	 System.out.println("PDC :");
	 int PDC=Integer.parseInt(s.nextLine());
	 System.out.println("GS :");
	 int GS=Integer.parseInt(s.nextLine());
	 System.out.println("PHY :");
	 int PHY=Integer.parseInt(s.nextLine());
	 System.out.println("CHEM :");
	 int CHEM=Integer.parseInt(s.nextLine());

	 int totalmarks=CMC+RS+PDC+GS+PHY+CHEM;
	 System.out.println("TM:"+totalmarks);
}}
