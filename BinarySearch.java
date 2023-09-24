package ArraySortRotateSearch;

public class BinarySearch {

	public int search(int[] arr, int right, int s) {
		
		int pivot=right/2; //2
		if(s==arr[pivot])
			return pivot;
		else if(s<arr[0])
			return binarySearch(arr,pivot+1,right,s);
		else
			return binarySearch(arr,0,pivot-1,s);
			
	}

	private int binarySearch(int[] arr, int left, int right, int s) {
		
		if(left>right)
			return -1;  //indicates number not found
		
		int mid=(left+right)/2;
		if(s==arr[mid])
			return mid;
		else if(s>arr[mid])
			return binarySearch(arr,mid+1,right,s);
		else
			return binarySearch(arr,left,mid-1,s);
	}

}
