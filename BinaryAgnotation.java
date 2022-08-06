
public class BinaryAgnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {6,5,4,3,2,1};
       int target=1;
       System.out.println(binarySearch(arr,target));
	}
	static int binarySearch(int[] arr, int target) {
		int start=0;
		int end=arr.length-1;
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
}
