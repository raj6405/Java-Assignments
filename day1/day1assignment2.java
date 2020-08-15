package day1javaassignment2;

public class day1assignment2 {
    public static void main(String[] args) {
		float item1 = (float)15.5;
		float item2 = (float)4.5;
		float item3 = 30;
		float tax = 5;
		float total = (float)item1 + item2 + item3;
		
		float FinalAmount = (float)(tax/100) * total + total;
		
		System.out.println(FinalAmount);
		
	}
}
