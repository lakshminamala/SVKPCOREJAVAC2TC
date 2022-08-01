package BankAccounting.Framework;

public class BankAcc {

		    public int accno;
			public String accname;
			public float accbal;
			
			public BankAcc(int accno, String accname, float accbal) {
				super();
				this.accno = accno;
				this.accname = accname;
				this.accbal = accbal;
			}
			public void withdraw(float bal) {
				
			}
			public void items(float bal) {
				
			}
			@Override
			public String toString() {
				return "BankAcc [accno=" + accno + ", accname=" + accname + ", accbal=" + accbal + "]";
			}
	}

