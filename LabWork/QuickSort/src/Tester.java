import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		QuickSort sort = new QuickSort();
		int[] arr = {4,2,1,45,3,221,8,23};
		System.out.println(Arrays.toString(arr));
		sort.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
}
