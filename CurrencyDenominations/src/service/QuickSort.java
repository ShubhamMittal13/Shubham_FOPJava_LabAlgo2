package service;

public class QuickSort {
	public void quickSort(int arr[], int low, int high) {
		if(low<high) {
			int pivot = partition(arr,low,high);
			quickSort(arr,low,pivot-1);
			quickSort(arr, pivot+1,high);
		}
	}
	
	private static int partition(int arr[], int low, int high) {
		int pivot=arr[high];
		int i =low-1;
		for(int j = low; j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,high,i+1);
		return i+1;
	}
	
	private static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
