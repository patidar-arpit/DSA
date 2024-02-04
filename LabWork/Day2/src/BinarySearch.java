
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int  [] arr = {10,20,40,50,70,100};
		
		System.out.println(binarySearch(arr,300));

	}

	private static int  binarySearch(int[] arr, int target) {
		// TODO Auto-generated method stub
		
		int low  = 0;
		int high = arr.length-1;
		
		int count  = 0;
		while(low <= high) {
			count++;
			int mid  = (low + high)/2;
			
			if(arr[mid] == target) {
				System.out.println("No of Comparison:"+count);
				return mid;
			}
			else if(arr[mid] > target)
			    high = mid -1;
			else
				low = mid+1;
		}
		
		System.out.println("No of Comparison:"+count);
		return -1;
		
	}

}
