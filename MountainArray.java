import java.util.Scanner;
public class MountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr= {1,2,3,4,2,1};
     Scanner cs=new Scanner(System.in);
     System.out.println("enter the target element");
     int target=cs.nextInt();
     ans(arr,target);
	}
	static int mountainArrayPeak(int [] arr) {
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int mid=start+(end-start)/2;
			if(arr[mid]>arr[mid+1]) {
				end=mid;
			}
			else if(arr[mid+1]>arr[mid]) {
				start=mid+1;
			}
		}
		return start;
	}
	static int binarySearch(int[] arr,int target,int start,int end) {
		if(arr[start]<arr[end]) {
			while(start<=end) {
				int mid=start+(end-start)/2;
				if(target>arr[mid]) {
					start=start+1;
				}
				else if(target<arr[mid]) {
					end=end-1;
				}
				else {
					return mid;
				}
			}
			return -1;
		}
		else {
			while(start<=end) {
				int mid=start+(end-start)/2;
				if(target<arr[mid]) {
					start=start+1;
				}
				else if(target>arr[mid]) {
					end=end-1;
				}
				else {
					return mid;
				}
			}
			return -1;	
	}
		
	}
	static void ans(int [] arr,int target) {
		int peak=mountainArrayPeak(arr);
		int asc=binarySearch(arr,target,0,peak);
		int dsc=binarySearch(arr,target,peak,arr.length-1);
		if(asc!=-1) {
			System.out.println("input found in "+binarySearch(arr,target,0,peak));
		}
		else if(dsc!=-1) {
			System.out.println("input found in "+binarySearch(arr,target,peak,arr.length-1));
		}
		else {
			System.out.println("sorry,not found");
		}
	}
}
