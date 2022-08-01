package ShoppingAcc.Application;

import ShoppingAcc.Framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {
		
		
		public static final float charges=0;
		
		public GSPrimeAcc(int accno, String accname, float charges, boolean isPrime) {
			super(accno, accname, charges, isPrime);
			// TODO Auto-generated constructor stub
		}

	     public void bookProduct(float charges) {
	    	 System.out.println("Dear prime user , your product charges are:" +charges);
	    	 
	     }

		@Override
		public String toString() {
			return "GSPrimeacc [isPrime=" + isPrime + ", accno=" + accno + ", accname=" + accname + ", charges=" + charges
					+ "]";
		}
	     
	     
		
	}

