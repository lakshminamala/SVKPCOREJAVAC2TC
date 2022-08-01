package BankAccounting.Client;

	import BankAccounting.application.MMBankFactory;
	import BankAccounting.application.MMCurrentAcc;
	import BankAccounting.application.MMSavingAcc;

	public class Client {
		
		public static void main(String[] args) {
			
			
			MMBankFactory mmbank=new MMBankFactory();
			mmbank.getNewCurrentAccount(0, null, 0, 0);
			mmbank.getNewSavingAccount(145, "laxmi", 5000, false);
			
			MMCurrentAcc mmcurrent=new MMCurrentAcc(123,"hasini",4000,1000);
			mmcurrent.withdraw(3000);
			
			MMSavingAcc mmsaving=new MMSavingAcc(142,"meggi",6000,true);
			mmsaving.withdraw(2500);
			
			mmcurrent.toString();
			mmsaving.toString();
			
			
		}
	}

