public class FirstAndLast {
	public static void main(String[] args) {
		int[] arr= {5,7,7,8,8,10};
		int target=8;
		System.out.println(search(arr,target));
	}
      public static int[] search(int[] arr,int target) {
	   int ans[]= {-1,-1};
	   int start=search1(arr,target,true);
	   int end=search1(arr,target,false);
	   ans[0]=start;
	   ans[1]=end;
	   return ans;
   }
       public static int search1(int[] arr,int target,boolean first){
	   int start=0;
	   int ans=-1;
	   int end=arr.length-1;
	   int mid=start+(end-start)/2;
	   while(start<=end) {
		   if(target>arr[mid]) {
			   start=mid+1;
		   }
		   else if(target<arr[mid]) {
			   end=mid-1;
		   }
		   else {
			   ans=mid;
			   if(first) {
				   end=mid-1;
				
			   }
			   else {
				   start=mid+1;
			   }
		   }
	   }
	   return ans;
   }
}
