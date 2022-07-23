package collections;
	import java.util.*; 
	public class linkedhashmapexample {
	 
		 public static void main(String args[]){  
		   
		   LinkedHashMap<Integer,String> num_map=new LinkedHashMap<Integer,String>();  
		   num_map.put(1,"onion");  
		   num_map.put(2,"carrot");  
		   num_map.put(3,"cabbage");
		   num_map.put(4,"potato");
		   num_map.put(5,"drumstick");
		   num_map.put(6,"tomato");
		   num_map.put(7,"chilli");
		   System.out.println("Vegetables are Available in Market:");
		   
		   for(Map.Entry m:num_map.entrySet()){  
		        System.out.println(m.getKey()+" "+m.getValue());  
		   }  
		 }  
	}

