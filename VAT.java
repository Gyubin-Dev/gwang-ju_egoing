import java.util.Scanner;

public class VAT {
	public static void main(String[] args) {
		
		double total = Double.parseDouble(args[0]); // 총액
		double ratio = 0.1;
		double vat = taxVAT(total, ratio); // 부가가치세 * 과세 비율
		double supplyValue = taxSupplyValue(total, vat); // 공급가액

		// 동업자의 급여
		double person1 = supplyValue * 0.5;
		double person2 = supplyValue * 0.3;
		double person3 = supplyValue * 0.2;
		
		taxPrint(total, vat, supplyValue);

		System.out.println("person1 : " + person1);
		System.out.println("person2 : " + person2);
		System.out.println("person3 : " + person3);

		System.out.println("E.N.D");

		// Bank.send("동업자1의 계좌번호 ", person1);
		// Bank.send("동업자2의 계좌번호 ", person2);
		// Bank.send("동업자3의 계좌번호 ", person3);

	}

	public static void taxPrint(double total, double vat, double supplyValue) {
		System.out.println("total : " + total);
		System.out.println("VAT : " + vat);
		System.out.println("supply value : " + supplyValue);
	}

	public static double taxSupplyValue(double total, double vat) {
		double supplyValue = total - vat;
		return supplyValue;
	}

	public static double taxVAT(double total, double ratio) {
		double vat = (total * ratio);
		return vat;
	}
}
