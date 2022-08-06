import java.util.Scanner;

public class FindSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the length of the array");
	 int len=sc.nextInt();
      int arr[] =new int[len];
      for(int i=0;i<len;i++) {
    	  arr[i]=sc.nextInt();
    	  System.out.println(findSum(arr,i));
      }
	}
   public static int findSum(int[] arr,int i)
 {
	 int num=2^(arr[i]);
	 int sum=0;
	 while(num<=10) {
		 int rem=num%10;
		 sum=sum+rem;
		 num=num/10;
	 }
	 return sum;
 }
}
