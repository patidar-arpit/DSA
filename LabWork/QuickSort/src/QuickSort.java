
public class QuickSort {

	public void sort(int[] arr)
	{
		quickSort(arr, 0, arr.length-1);
	}
	
	public void quickSort(int[] arr,int start, int end)
	{
		if(start<end)
		{
			int pivot = partition(arr, start, end);
			quickSort(arr,start, pivot-1);
			quickSort(arr,pivot+1, end);
		}
	}

	private int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int i = start;
		for(int j=start ; j<end ; j++)
		{
			if(arr[j] < pivot)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}
		}
		int temp = arr[i];
		arr[i] = arr[end];
		arr[end] = temp;
		return i;
		
	}
	
}
