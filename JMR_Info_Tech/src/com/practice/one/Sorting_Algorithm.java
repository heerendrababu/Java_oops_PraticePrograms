package com.practice.one;

public class Sorting_Algorithm {

	public static void main(String[] args) 
	{
       
		int[] arr = {1,9,2,8,3,7,4,6,5,10};
		for(int i =0;i<=arr.length-1;i++)
		{
			int smallest = i;
			for(int j = i+1;j<=arr.length-1;j++)
			{
				if(arr[smallest]>arr[j])
				{
					smallest = j;
				}
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
			System.out.print(arr[i]+",");
			}
	}
}

