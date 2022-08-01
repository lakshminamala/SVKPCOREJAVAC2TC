package BankAccounting.Framework;

public interface BankFactory {
		
		public abstract SavingAcc getNewSavingAccount(int accno, String accname, float accbal, boolean isSalaried);
		public abstract CurrentAcc getNewCurrentAccount(int accno, String accname, float accbal, float MINBAL);

	}


