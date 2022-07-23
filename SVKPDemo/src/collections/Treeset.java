package collections;
	import java.util.*;
	public class Treeset {

			public static void main(String[] args)
			{
				
				Set<Integer> ts = new TreeSet<>();

				ts.add(45);
				ts.add(89);
				ts.add(43);
				ts.add(12);
				ts.add(56);
				ts.add(78);

				for (Integer value : ts)

					System.out.print( value + "  ");

				System.out.println();
			}
	}
