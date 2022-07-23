package collections;

	import java.io.*;
	import java.util.*;
	public class linkedhashsetexample {
	
	public static void main(String[] args)
			{

				
				LinkedHashSet<String> linkedhashset= new LinkedHashSet<String>();
				
				linkedhashset.add("lakki");
				linkedhashset.add("ammu");
				linkedhashset.add("sri");
				linkedhashset.add("venkat");
				linkedhashset.add("suu");
				linkedhashset.add("hasini");

				System.out.println("Initial HashSet " + linkedhashset);

				linkedhashset.remove("suu");

				System.out.println("After removing string " + linkedhashset);

			}
	}


