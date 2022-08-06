package Recursion;
import java.util.*;
public class BinaryList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,5};
		int target=5;
        System.out.println(find(arr,target,0,new ArrayList<Integer>()));
	}
	static ArrayList<Integer> find(int[] arr,int target,int index,ArrayList<Integer> list) {
		if(index==arr.length) {
			return list;
		}
		if(arr[index]==target) {
			list.add(index);
		}
		return find(arr,target,index+1,list);
	}
 
}
