package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateElement {
	static ArrayList<Integer> findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]!=nums[nums[i]-1]){
                
                  swap(nums,i,nums[i]-1);
            }
            else{
                i++;
            }
        }
            ArrayList<Integer> lst=new ArrayList<>();
            for(i=0;i<nums.length;i++) {
          	  if(i!=nums[i]-1) {
          		  lst.add(nums[i]);
            }
          
        }
            return lst;
}
    static void swap(int[] arr,int first,int second){
            int temp=arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,3,2,2,3,1};
        System.out.println(findDuplicate(nums));
	}

}
