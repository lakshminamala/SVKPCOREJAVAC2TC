package ShoppingAcc.Framework;

	public class PrimeAcc extends ShopAcc {
		
		public boolean isPrime;

		public PrimeAcc(int accno, String accname, float charges, boolean isPrime) {
			super(accno, accname, charges);
			this.isPrime = isPrime;
		}
		
		public void bookProduct(float charges) {
			
		}

		@Override
		public String toString() {
			return "PrimeAcc [isPrime=" + isPrime + "]";
		}
		
	}

