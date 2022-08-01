package ShoppingAcc.Application;

import ShoppingAcc.Framework.ShopFactory;

public class GSShopFactory implements ShopFactory{
		

		
			@Override
			public GSNormalAcc getNewNormalAccount(int accno, String accname, float charges, float deliverycharges) {
			  
				GSNormalAcc gsnormal=new GSNormalAcc(accno , accname, charges , deliverycharges);
				return gsnormal;
			}

		@Override
		public GSPrimeAcc getNewPrimeAccount(int accno, String accname, float charges, boolean isPrime) {
			
			GSPrimeAcc gsprime=new GSPrimeAcc(accno,accname, charges, isPrime);
			return gsprime;
		}
		  
	}

