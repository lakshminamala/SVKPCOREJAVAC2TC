package BankAccounting.application;


	import BankAccounting.Framework.SavingAcc;
	import BankAccounting.Framework.CurrentAcc;
	import BankAccounting.Framework.BankFactory;

	public class MMBankFactory implements BankFactory{

		@Override
		public MMSavingAcc getNewSavingAccount(int accno, String accname, float accbal, boolean isSalaried) {
			
			MMSavingAcc mmsaving=new MMSavingAcc(accno, accname, accbal, isSalaried);
			return mmsaving;
		}

		@Override
		public MMCurrentAcc getNewCurrentAccount(int accno, String accname, float accbal, float MINBAL) {
			
			MMCurrentAcc mmcurrent=new MMCurrentAcc(accno , accname, accbal, MINBAL);
			return mmcurrent;
		}
		

}
