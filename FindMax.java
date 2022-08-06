
   class FindMax {
	     static int findMax(int[] arr){
	        int start=0;
	        int end=arr.length-1;
	        while(start<end){
	            int mid=start+(end-start)/2;
	            if(arr[mid+1]>arr[mid]){
	                start=mid+1;
	            }
	            else if(arr[mid]>arr[mid+1]){
	                end=mid;
	            }
	        }
	        return start;
	    }
		public static void main(String[] args) {
	        int[] arr={1,4,5,3,2};
	        System.out.println(findMax(arr));
		}
	}
