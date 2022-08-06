package sorting;

import java.util.ArrayList;
import java.util.List;

public class MissingElement {
 public static void main(String[]args) {
	 int[] arr= {3,0,4};
	 System.out.println(missing(arr));
 }
 
    static List<Integer> missing(int[] arr) {
	// TODO Auto-generated method stub
    	int i=0;
		while(i<arr.length) {
			int correct =arr[i];
			if(arr[i]<arr.length && arr[i]!=arr[correct]) {
				swap(arr,i,correct);
			}
			else {
				i++;
			}
		}
		List<Integer> lst=new ArrayList<>();
		for(int i1=0;i1<arr.length;i1++) {
			if(arr[i1]!=i1) {
				lst.add(i1);
			}
		}
		return lst;
}
	 static void swap(int[] arr, int first, int second) {
		// TODO Auto-generated method stub
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}
}