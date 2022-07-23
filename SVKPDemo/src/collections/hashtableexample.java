package collections;

	import java.io.*;
	import java.util.*;
	public class hashtableexample{

			public static void main(String args[])
			{
			
				Hashtable<Integer, String> ht1 = new Hashtable<>();
				Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>();

		
				ht1.put(19, "Vinnu");
				ht1.put(45, "Aruna");
				ht1.put(23, "Ramu");

				ht2.put(35, "Sundharani");
				ht2.put(34, "Madhavi");
				ht2.put(12, "Bujji");

				
				System.out.println("Student ID with Names : " + ht1);
				System.out.println("Student ID with Names : " + ht2);
			}
	}


