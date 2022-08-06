package Recursion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(fact(3));
	} 
	static int  fact(int num) {
		if(num<=1) {
			return 1;
		}
		return num*fact(num-1);
	}
}
