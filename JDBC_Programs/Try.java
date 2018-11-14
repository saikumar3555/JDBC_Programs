public class Try
{
	
	public static void main(String[] args)
	{
	 System.out.println("main");
	 Try1 f=new Try1();
	 f.m();
	 Try[] arr=new Try[4];
	 arr[0]=new Try();
	 arr[1]=new Try();
	 arr[2]=new Try1();
	 //arr[3]=new Try4();
	 System.out.println("array ends");
    }
} 
 class Try1 extends Try
{
	void m()
	{
	System.out.println("Try");
	}
	
}