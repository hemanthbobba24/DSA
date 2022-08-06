import java.util.*;
public class BinarySearch {
 public static void main(String[]args)
 {
	 int arr[]= {781,423,321,10,9,7,3,1};
	 Scanner sc=new Scanner(System.in);
     System.out.println("enter the number of elements to find");
	 int n=sc.nextInt();
	 int target[]=new int[n];
	 int i;
	 for(i=0;i<target.length;i++) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter the number to find");
		 target[i]=s.nextInt();
		 System.out.println(bS(arr,target,i));
	 }
 }
 static String bS(int[] arr, int target) {
	 int start=0;
	 int end=arr.length-1;
	 if(arr[0]<arr[arr.length-1]) {
	 while(start<=end) {
		 int mid=(start+end)/2;
		 if(arr[mid]<target) {
			 start=mid+1;
		 }
		 else if(arr[mid]>target) {
			 end=mid-1;
		 }
		 else {
		 return "it is in "+Integer.toString(mid)+" index";
		 } 
	 }
	 }
	 else {
		 while(start<=end) {
			 int mid=(start+end)/2;
			 if(arr[mid]>target[i]) {
				 start=mid+1;
			 }
			 else if(arr[mid]<target[i]) {
				 end=mid-1;
			 }
			 else {
				 return "it is in "+Integer.toString(mid)+" index";
			 } 
		 }
	 }
	 return "Not Found";
	 
 }
}
