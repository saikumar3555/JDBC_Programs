import java.util.Scanner;
public class ReverseStr
{
	// static String inputstring="sai";
  public String reverceString(String inputstring)
  {
	  
	  String str="";
	  char[] arr=inputstring.toCharArray();
      for(int index=arr.length-1;index>=0;index--)
	  {
		  char ch=arr[index];
		   str=str+ch;
	    }
		return str;
		
  }
 public static void main(String[] args)
 {
	// Scanner s=new Scanner(System.in);
	// System.out.println("Enter input String  ");
	// String inputstring=s.nextLine();
	String inputstring=args[0];
  ReverseStr rs=new ReverseStr();
  String ss=rs.reverceString(inputstring);
  System.out.println(""+ss);
 }
}