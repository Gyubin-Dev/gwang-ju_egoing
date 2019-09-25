
class Tax {

	public double total;
	public static double ratio;

	public Tax(double total) {
		this.total = total;
	}

	public double VAT() {
		double VAT = (total * ratio);
		return VAT;
	}

	public double supplyValue() {
		double supplyValue = total - VAT();
		return supplyValue;
	}

	public void print() {
		System.out.println("Total : " + total);
		System.out.println("VAT : " + VAT());
		System.out.println("Supply Value : " + supplyValue());
	}



}

public class VAT2 {
	public static void main(String[] args) {
		// 1번째 0000 기능 
//		// ..
//		Tax.setTotal(10000.0);
//		Tax.setRatio(0.1);
//		double VAT = Tax.VAT();
//		double supplyValue = Tax.supplyValue();
//		Tax.print();
//		// ..
//		Tax.setTotal(20000.0);
//		Tax.setRatio(0.1);
//		VAT = Tax.VAT();
//		supplyValue = Tax.supplyValue();
//		Tax.print();

		//3번째 00 기능 추가. 
		Tax.ratio = 0.1;

		//2번재 -0--- 기능 
		Tax tax1 = new Tax(10000.0);
		tax1.print();

		Tax tax2 = new Tax(20000.0);
		tax2.print();
		
		tax1.print();
		tax2.print();
		

	}

}
