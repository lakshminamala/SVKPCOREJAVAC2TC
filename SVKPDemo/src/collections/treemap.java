package collections;
	import java.util.*;
	import java.util.concurrent.*;
	public class treemap {
	  

	    static void Example1stConstructor()
	    {

	        TreeMap<Integer, String> tree_map
	            = new TreeMap<Integer, String>();
	  
	    
	        tree_map.put(45, "Hello");
	        tree_map.put(55, "Lakshmi");
	        tree_map.put(65, "Durga");
	    
	  
	        System.out.println("TreeMap: " + tree_map);
	    }
	  
	  
	    public static void main(String[] args)
	    {
	        System.out.println("TreeMap using "
	                           + "TreeMap() constructor:\n");
	  
	      
	        Example1stConstructor();
	    }
	}


