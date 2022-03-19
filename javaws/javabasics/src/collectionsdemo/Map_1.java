package collectionsdemo;
import java.util.HashMap;
import java.util.Map;
public class Map_1 {
	public static void main(String[] args) {
		// key value pair
		Map<Integer,String> demoMap = new HashMap<Integer,String>();
		demoMap.put(1, "prod 1");
		demoMap.put(2, "prod 2");
		demoMap.put(3, "prod 3");
		
		System.out.println("Iterating Hashmap...");  
		   for(Map.Entry m : demoMap.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
	}

}
