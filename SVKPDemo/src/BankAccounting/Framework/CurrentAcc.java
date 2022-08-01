package BankAccounting.Framework;


	public class CurrentAcc extends BankAcc {
		
		public final float MINBAL;

		public CurrentAcc(int accno, String accname, float accbal, float mINBAL) {
			super(accno, accname, accbal);
			MINBAL = mINBAL;
		}
		
		public void withdraw (float bal) {
			
		}

		@Override
		public String toString() {
			return "CurrentAcc [MINBAL=" + MINBAL + "]";
		}
		
		

	}

