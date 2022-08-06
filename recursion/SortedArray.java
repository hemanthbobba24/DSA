package Recursion;

public class SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {2,1};
        System.out.println(sort(arr,0));
	}
	static boolean sort(int[] arr,int index) {
		if(index==arr.length-1) {
			return true;
		}
		if(arr[index]<arr[index+1]) {
			return sort(arr,index+1);
		}else {
			return false;
		}
		
	}

}
