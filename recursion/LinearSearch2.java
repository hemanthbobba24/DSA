package Recursion;
import java.util.*;
public class LinearSearch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] num= {1,3,4,5,4,3,4,-1};
      int target=2;
      find(num,target,0);
      System.out.println(list);
	}
	static ArrayList<Integer> list=new ArrayList<Integer>();
    static void find(int[] num,int target,int index) {
	 if(index==num.length) {
		 return;
	 }
	 if(target==num[index]) {
		 list.add(index);
	 }
	 find(num,target,index+1);
   }
}
