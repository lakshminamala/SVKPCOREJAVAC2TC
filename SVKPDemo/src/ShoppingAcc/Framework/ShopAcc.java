package ShoppingAcc.Framework;

public class ShopAcc {


		public int accno;
		public String accname;
		public float charges;
		
	    public ShopAcc(int accno, String accname, float charges) {
			super();
			this.accno = accno;
			this.accname = accname;
			this.charges = charges;
		}
	    public void bookProduct(float charges) {
	    	
	    }
	    public void items(float charges) {
	    	
	    }
		@Override
		public String toString() {
			return "ShopAcc [accno=" + accno + ", accname=" + accname + ", charges=" + charges + "]";
		}
	    
	}

