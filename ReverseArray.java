import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,1,3,8,2,7};
		reverse(arr);
		reverse1(arr);

	}
	static void reverse(int[] arr) {
	  int start=0;
	  int end=arr.length-1;
	  while(start<end) {
		  int temp=arr[start];
		  arr[start]=arr[end];
		  arr[end]=temp;
		  start=start+1;
		  end=end-1;
	  }
	 System.out.println(Arrays.toString(arr));
	}
     static void reverse1(int[] arr) {
    	 String k="";
    	 for(int i=arr.length-1;i>=0;i--) {
    		 if(i==0) {
    		k=k+arr[i];
    	 }
    		 else {
    			 k=k+arr[i]+",";
    		 }
    	 }
    	 System.out.println(k);
     }
}
