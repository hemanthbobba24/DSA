public class RotatedBinarySearch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {5,6,7,8,9,10,1};
      int target=10;
      System.out.println(searchTarget(arr,target));
	}
    static int searchPivot(int [] arr) {
    	int start=0;
    	int end=arr.length-1;
    	while(start<=end) {
    		int mid=start+(end-start)/2;
    		if(mid<end && arr[mid]>arr[mid+1]) {
    			return mid;
    		}
    		if(start<mid && arr[mid-1]>arr[mid]) {
    			return mid-1;
    		}
    		if(arr[start]>arr[mid]) {
    			end=mid-1;
    		}
    		else {
    			start=mid+1;
    		}
    	}
    	return -1;
    }
    static int binarySearch(int[] arr,int target,int start,int end){
    	while(start<=end) {
    		int mid=start+(end-start)/2;
    		if(arr[mid]<target) {
    			start=mid+1;
    		}
    		else if(arr[mid]>target) {
    			end=mid-1;
    		}
    		else {
    			return mid;
    		}
    	}
    	return -1;
    }
    static int searchTarget(int[] arr,int target) {
    	int pivot=searchPivot(arr);
    	if(pivot==-1) {
    		return binarySearch(arr,target,0,arr.length-1);
    	}
    	if(arr[pivot]==target) {
    		return pivot;
    	}
    	if(arr[0]<target) {
    		return binarySearch(arr,target,0,pivot-1);
    	}
    	else {
    		return binarySearch(arr,target,pivot+1,arr.length-1);
    	}
    }
    	
}
