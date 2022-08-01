package ShoppingAcc.Framework;

public interface ShopFactory {
	

		
		public abstract PrimeAcc getNewPrimeAccount(int accno, String accname, float charges, boolean isPrime);
		public abstract NormalAcc getNewNormalAccount(int accno, String accname, float charges, float deliverycharges);

	}



