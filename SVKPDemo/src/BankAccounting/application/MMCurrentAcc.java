package BankAccounting.application;

	
	import BankAccounting.Framework.CurrentAcc;

	public class MMCurrentAcc extends CurrentAcc{

		public MMCurrentAcc(int accno, String accname, float accbal, float mINBAL) {
			super(accno, accname, accbal, mINBAL);
			// TODO Auto-generated constructor stub
		}
		

		public void withdraw(float bal) {
			System.out.println("Dear current user  your account balance are:"
					+" "+bal+ " with MINBAL are"+MINBAL);
		}

		@Override
		public String toString() {
			return "MMCurrentAcc [MINBAL=" + MINBAL + ", accno=" + accno + ", accname=" + accname + ", accbal=" + accbal
					+ "]";
		}

	}


