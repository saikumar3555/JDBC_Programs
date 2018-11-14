import java.io.*;
public class BookData implements Serializable
{
	public int bcode,bqty;
	public String bname,bauthor;
	public float bprice;
    public BookData(int bcode,String bname,String String,float bprice,int bqty)
	{
		this.bcode=bcode;
		this.bname=bname;
		this.bauthor=bauthor;
		this.bprice=bprice;
		this.bqty=bqty;
	}
	public String toString()
	{
		return bcode+"\t"+bname+"\t"+bauthor+"\t"+bprice+"\t"+bqty;
	}
	
}