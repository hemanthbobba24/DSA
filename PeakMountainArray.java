
public class PeakMountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {5,6,4,3,2,1,0};
        System.out.println(findPeak(arr));
	}
	static int findPeak(int[] arr) {
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int mid=start+(end-start)/2;
			if(arr[mid]>arr[mid+1])
			{
				end=mid;
			}
			else if(arr[mid+1]>arr[mid]) {
				start=mid+1;
			}
		}
		return start;
	}

}
