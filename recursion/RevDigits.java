package Recursion;

public class RevDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       revDigits(12345);
       System.out.println(sum);
	}
	static int sum=0;
	static void revDigits(int num) {
		if(num==0) {
			return;
		}
		int rem=num%10;
		sum=sum*10+rem;
		revDigits(num/10);
	}
}
