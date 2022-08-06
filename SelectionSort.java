import java.util.Arrays;
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr= {5,4,3,2,1};
          sort(arr);
     	System.out.println(Arrays.toString(arr));
	}
	 static int findMax(int[] arr,int k) {
		int max=0;
		for(int i=0;i<k;i++) {
			if(arr[max]<=arr[i])
			{
				max=i;
			}
		}
		return max;
	}
    static void sort(int[] arr) {
    	for(int i=0;i<arr.length;i++) {
    		int maxindex=findMax(arr,arr.length-i-1);
    		int temp=arr[maxindex];
    		arr[maxindex]=arr[arr.length-i-1];
    		arr[arr.length-i-1]=temp;
    	}
		
    	
    }

}
