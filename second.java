public class second {
    public static int diagonalSum(int[][] mat) {
        int sum=0;
        for(int row=0;row<mat.length;row++){
            for(int col=0;col<mat[row].length;col++)
            {
                if(row==col){
                    sum=sum+mat[row][col];
                }
            }
        }
        return sum;
    }
    public static int reverseSum(int[][] mat) {
    	int sum=0;
    	return sum;
    }
    public static void main(String[]args) {
    	int[][] mat= {
    			{1,2,3},
    			{4,5,6},
    			{2,4,7}
    	};
    	System.out.println(reverseSum(mat));
    }
}
