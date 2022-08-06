package Recursion;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,34,56,233};
		int target=56;
		System.out.println(search(arr,target,0,arr.length-1));

	}
	static int search(int[] arr,int target,int start,int end) {
		int mid=start+(end-start)/2;
		if(start>end) {
			if(target==arr[mid]) {
				return mid;
			}
			return -1;
		}
		if(target>arr[mid]) {
			return search(arr,target,mid+1,end);
		}else {
			return search(arr,target,start,mid-1);
		}
	}

}
