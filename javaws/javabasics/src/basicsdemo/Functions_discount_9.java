package basicsdemo;
public class Functions_discount_9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		discount(10000);
	}

	public static void discount(float purchaseAmt) {
		float discountperc;
		float discount;
		float netAmt;
		if(purchaseAmt <=10000) {
			discountperc=0.05f;
		}else if (purchaseAmt > 10000 && purchaseAmt <= 20000) {
			discountperc=0.1f;
		}else {
			discountperc=0.15f;
		}
		discount = purchaseAmt*discountperc;
		netAmt = purchaseAmt-discount;
		System.out.println("Purchase Amount "+purchaseAmt + " Discount :: "+discount + "Net Amount to pay "+netAmt);
	}

}
