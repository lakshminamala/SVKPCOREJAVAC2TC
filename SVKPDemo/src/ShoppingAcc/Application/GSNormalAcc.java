package ShoppingAcc.Application;

import ShoppingAcc.Framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {

		public GSNormalAcc(int accno, String accname, float charges, float deliverycharges) {
			super(accno, accname, charges, deliverycharges);
			// TODO Auto-generated constructor stub
		}
		
		public void bookProduct(float charges) {
			System.out.println("Dear normal user , your product charges are:"
					+" "+charges+ " with delivery charges"+deliverycharges);
		}

		@Override
		public String toString() {
			return "GSNormalAcc [deliverycharges=" + deliverycharges + ", accno=" + accno + ", accname=" + accname
					+ ", charges=" + charges + "]";
		}
		
		
	}

