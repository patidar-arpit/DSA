package recursion;

public class PrintPattern {

	public static void main(String[] args) {
		
		printPatternByRec(4);
		printPatternByRec1(4,0);
		printPatternByRec2(4,0 );

	}

	private static void printPatternByRec2(int row, int col) {
		
		
		
	}

	private static void printPatternByRec1(int row,int col) {
		// TODO Auto-generated method stub
		if(row==0)
			return;  
		if(row==col)
		{
			System.out.println();
			printPatternByRec1(row-1, 0);
			
			
		}
		
		else {
			System.out.print("*"+" ");
			printPatternByRec1(row,col+1);
			
			
		}
		
	}

	private static void printPatternByRec(int n) {
		// TODO Auto-generated method stub
		
		if(n<=0)
			 return;
		
		for(int i = 0;i<n;i++) {
			System.out.print("*"+" ");
		}
		System.out.println();
		printPatternByRec(n-1);
		
	}

}
