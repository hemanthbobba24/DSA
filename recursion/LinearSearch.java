package Recursion;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,23,4,6};
		int target=16;
        System.out.println(search(arr,target,0));
	}
	static int search(int[] arr,int target,int index) {
		if(index==arr.length) {
			return -1;
		}
		if(target==arr[index]) {
			return index;
		}else {
			return search(arr,target,index+1);
		}
	}

}
