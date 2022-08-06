
public class Pivot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr= {2,7,4,1,2,6,2};
      int[] arr1= {2,1,3,4};
      int arr2[]= {5,6,7,2,3};
      System.out.println(findPivot(arr2));
      System.out.println(findPivot(arr));
      System.out.println(findPivot(arr1));
	}
	static int findPivot(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
         int mid=start+(end-start)/2;
        if(end>mid && nums[mid]>nums[mid+1]){
            return mid;
        }
            if(mid>start && nums[mid-1]>nums[mid]){
                return mid-1;
            }
            if(nums[start]>=nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
