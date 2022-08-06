package Recursion;

public class Fabonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(fabo(10));
	}
    static int fabo(int num) {
    	if(num<=1) {
    		return num;
    	}
    	return  fabo(num-1)+fabo(num-2);
    }
}
