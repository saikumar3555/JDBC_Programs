import java.util.Scanner;
import java.sql.*;
public class CallableDemo2
{
  static int totalmarks=0;
  static String fc;
   public static void main(String[] args)throws SQLException,ClassNotFoundException
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
	 
	 int[] array=new int[6];
	 array[0]=CMC;
	 array[1]=RS;
	 array[2]=PDC;
	 array[3]=GS;
	 array[4]=PHY;
	 array[5]=CHEM;
	 for(int e:array)
	 {
	   totalmarks=totalmarks+e;
	 }
	 System.out.println("Total Marks are : "+totalmarks);
	 float per=((totalmarks*100)/600);
	 System.out.println(" percentage is:" +per+"%");
	   if(per>90){
		  System.out.println("Result is : FirstClass");
		 
		    fc="Firstclass";
	    }else if(per>70){
		  System.out.println("Result is : Second Cls");
		   fc="Secondclass";
		   
	        }else if(per>50){
		       System.out.println("Result is : ThirdClass");
			    fc="Thirdrrclass";
				
	             }else{
		             System.out.println("Result is : Fail");
					  fc="Fail";
					  
	              }
	 
	 //System.out.println("Enter Result");
	// String Result=s.nextLine();
	 
	 
	 Class.forName("oracle.jdbc.driver.OracleDriver");  
     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
     CallableStatement cs=con.prepareCall("{call StudentData13(?,?,?,?,?,?,?,?,?,?)}");
	 cs.setInt(1,Roolnumber);
	 cs.setString(2,name);
	 cs.setString(3,branch);
	 cs.setInt(4,hno);
	 cs.setString(5,sname);
	 cs.setString(6,city);
	 cs.setInt(7,pincode);
	 cs.setInt(8,totalmarks);
	 cs.setFloat(9,per);
	 cs.setString(10,fc);
	 
	 cs.execute();
	 System.out.println("Student details updated successfully....");
	 con.close();
	 s.close(); 
	
	 
 }   	
}