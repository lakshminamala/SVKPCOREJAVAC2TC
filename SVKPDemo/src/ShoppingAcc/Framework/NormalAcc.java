package ShoppingAcc.Framework;

	public class NormalAcc extends ShopAcc {
		
		public final float deliverycharges;

		public NormalAcc(int accno, String accname, float charges, float deliverycharges) {
			super(accno, accname, charges);
			this.deliverycharges = deliverycharges;
		}
		
		public void bookProduct(float charges) {
			
		}

		@Override
		public String toString() {
			return "NormalAcc [deliverycharges=" + deliverycharges + "]";
		}

		
	}

