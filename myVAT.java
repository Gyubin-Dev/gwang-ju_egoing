import javax.swing.JOptionPane;

public class myVAT {

	public static void main(String[] args) {
		double inputTotal = Double.parseDouble(JOptionPane.showInputDialog("Please input total : " ));
		System.out.println(inputTotal);
		double total = Double.parseDouble(args[0]);

		print(inputTotal);

	}

	public static void print(double total) {
		
		double ratio = 0.1;
		double vat = total*ratio;
		double supplyValue = total - vat;
		
		System.out.println("총액 : " + total);
		System.out.println("부가가치세 : " + vat);
		System.out.println("공급가 : " + supplyValue);
		
	}

}
