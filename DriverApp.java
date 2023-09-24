package ArraySortRotateSearch;

import java.util.Arrays;
import java.util.Scanner;

public class DriverApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the Array Size");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		for (int i = 0; i < arr.length; i++)
			arr[i]=sc.nextInt();
		
		System.out.println("Accepted Array : "+Arrays.toString(arr));
		
		MergeSort ms=new MergeSort();
		ms.sort(arr,0,size-1);
		
		System.out.println("Array after Sorting: "+Arrays.toString(arr));
		
		int midElement=size/2;  //8/2 =4
		ArrayRotate ar=new ArrayRotate();
		ar.rotate(arr,midElement);
		
		System.out.println("Array Rotating at Mid: "+Arrays.toString(arr));
		
		System.out.println("Please enter the Number to Search");
		int s=sc.nextInt();
		
		BinarySearch bs=new BinarySearch();
		int index=bs.search(arr,arr.length-1,s);
		if(index==-1)
			System.out.println("Number does not exist");
		else
			System.out.println("Found at Index "+index);
		

	}

}
