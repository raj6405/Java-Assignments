
public class Day1Assignment1 {
	public static void main(String[] args) {
		float item1 = 70;
		float item2 = 20;
		float item3 = 10;
		float tax = 18;
		float total = item1 + item2 + item3;
		float FinalAmount = (tax/100)*total + total;
		
		System.out.println(FinalAmount);
	}

}
