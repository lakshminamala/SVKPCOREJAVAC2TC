package BankAccounting.Framework;

	public class SavingAcc extends BankAcc {
		
		public boolean isSalaried;

		public SavingAcc(int accno, String accname, float accbal, boolean isSalaried) {
			super(accno, accname, accbal);
			this.isSalaried = isSalaried;
		}
		
		public void withdraw(float bal) {
			
		}

		@Override
		public String toString() {
			return "SavingAcc [isSalaried=" + isSalaried + "]";
		}
		

	}

