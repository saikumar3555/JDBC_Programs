import java.io.*;
public class ProductData implements Serializable
{
 public String pcode,pname;
 public float pprice;
 public int pqty;
 public ProductData(String pcode,String pname,float pprice,int pqty)
 {
	 this.pcode=pcode;
	 this.pname=pname;
	 this.pprice=pprice;
	 this.pqty=pqty;
 }
	 public String toString()
	 {
		 return pcode+"\t"+pname+"\t"+pprice+"\t"+pqty;
	 }
 }
