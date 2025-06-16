package BinarySearch;
//This binary search is only applicable for Already Sorted array.

import java.util.Scanner;

public class BinarySearch{

    public static int binarySearch(int arr[], int target)
    {
       int low = 0; int high = arr.length-1 ;
       int mid ;
       while(low<=high)
       {
        mid = low+ ((high - low)/2);
        if(target == arr[mid])
        {
            return mid;
        }
        else if(target >arr[mid])
        {
            low = mid +1;
        } else if(target < arr[mid])
        {
            high = mid-1;
        }
       }
       return -1;
    }

    public static void main(String args[])
    {
        int target , size;
        
        Scanner sc =  new Scanner(System.in);
       
        System.out.println("Enter the size of the array : ");
        size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element: "); 
        target = sc.nextInt();
     sc.close();

        System.out.println("Element "+target+ " found at index" + binarySearch(arr, target));
    }
}

