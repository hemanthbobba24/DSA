package Recursion;

public class Palindrome {
	static int sum=0;
	static void rev(int num) {
		if(num==0) {
			return;
		}
		int rem=num%10;
		sum=sum*10+rem;
		rev(num/10);
	}
	static boolean palin(int num) {
		if(sum==num) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=11011;
		rev(num);
		System.out.println(palin(num));
}
}
