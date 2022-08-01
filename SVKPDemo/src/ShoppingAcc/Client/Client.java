package ShoppingAcc.Client;

import ShoppingAcc.Application.GSNormalAcc;
import ShoppingAcc.Application.GSPrimeAcc;
import ShoppingAcc.Application.GSShopFactory;

public class Client {
	
	public static void main(String[] args) {
	
		GSShopFactory gsshop=new GSShopFactory();
		gsshop.getNewPrimeAccount(0, null, 0, false);
		gsshop.getNewNormalAccount(1234, "lakshmi", 25000, 50);
		
		
		GSPrimeAcc gsprime=new GSPrimeAcc(123, "varun",34500,true);
		gsprime.bookProduct(5630);
		
		GSNormalAcc gsnormal=new GSNormalAcc(135,"suhu",45000,40);
		gsnormal.bookProduct(350);
		
		gsprime.toString();
		gsnormal.toString();
		
	}

	
}
