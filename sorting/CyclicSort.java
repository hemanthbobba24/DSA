package sorting;

import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,3,1,2,4};
        cyclicSort(arr);
	}
	 static void cyclicSort(int arr[]) {
		int i=0;
		while(i<arr.length) {
			int correct =arr[i]-1;
			if(arr[i]!=arr[correct]) {
				sort(arr,i,correct);
			}
			else {
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	    static void sort(int[] arr,int first,int second) {
		// TODO Auto-generated method stub
	    	int temp=arr[first];
	    	arr[first]=arr[second];
	    	arr[second]=temp;
	}

}
