package BinarySearch;
import java.util.Scanner;
public class B1 
 {
public static void main(String[] args)
    {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
    
        int element = 30;

        int li = 0;                // low index
        int hi = arr.length - 1;   // high index
        boolean found = false;

        while (li <= hi)
        {
            int mid = (li + hi) / 2;

            if (arr[mid] == element)
            {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            }

            if (element > arr[mid])
            {
                li = mid + 1;   // search in right half
            }
            else
            {
                hi = mid - 1;   // search in left half
            }
        }

        if (!found)
        {
            System.out.println("Element not found");
        }
    }
 }