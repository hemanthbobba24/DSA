package Recursion;

public class SumOfDigits {
 public static void main(String[]args){
	 System.out.println(sumDigits(100));
 }
 static int sumDigits(int num) {
	 if(num<=9) {
		 return num;
	 }
	 int rem=num%10;
	 return rem+sumDigits(num/10);
 }
}
