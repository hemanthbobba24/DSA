
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int k=121;
       System.out.println(pal(k));
	}
	static boolean pal(int x) {
		String k=Integer.toString(x);
		String k1="";
		for(int i=k.length()-1;i>=0;i--) {
			k1=k1+k.charAt(i);
		}
		if(k1.equals(k)) {
			return true;
		}
		return false;
	}

}
