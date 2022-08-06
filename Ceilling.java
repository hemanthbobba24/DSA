import java.util.*;
public class Ceilling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[]= {'a','c','d','f'};
		char target='b';
		System.out.println(ceiling(arr,target));
	}
	static char ceiling(char[] arr,char target) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(target>arr[mid]) {
				start=mid+1;
			}
			else if(target<arr[mid]){
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		if(target>=arr[arr.length-1]) {
			return arr[0];
		}
		return arr[start];
	}
}
