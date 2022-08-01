package BankAccounting.application;

	import BankAccounting.Framework.SavingAcc;

	public class MMSavingAcc extends SavingAcc {
		
		public static final float MINBAL=0;
		
		
		public MMSavingAcc(int accno, String accname, float accbal, boolean isSalaried) {
			super(accno, accname, accbal, isSalaried);
			// TODO Auto-generated constructor stub
		}
		
		public void withdraw(float bal) {
			System.out.println("Dear Saving user , your bal are:" +bal);
			
		}

		@Override
		public String toString() {
			return "MMSavingAcc [isSalaried=" + isSalaried + ", accno=" + accno + ", accname=" + accname + ", accbal="
					+ accbal + "]";
		}
		
	}
