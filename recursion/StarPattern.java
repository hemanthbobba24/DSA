package Recursion;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        star(4);
	}
    static void star(int num) {
    	if(num==0) {
    		return;
    	}
    	System.out.print("*");
    	System.out.println();
    	star(num-1);
    }
}
