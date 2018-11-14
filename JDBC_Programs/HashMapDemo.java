import java.util.HashMap;
import java.util.Set;
public class HashMapDemo{

  public static void main(String args[])throws Exception{ 
     HashMap<Integer,String> map = new HashMap<Integer,String>();
	 map.put(101 , "KATKAM");
	 map.put(102 , "SAI");
	 map.put(103 , "SANTHOSH");
	 
	Set<Integer> keys =  map.keySet();
	for(Integer key :keys){
		String value = map.get(key);
		System.out.println(key + " : " +value);
	}
	
	System.out.println(map.containsKey(2134));
	 
 }
}