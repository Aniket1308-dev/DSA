package Arrays;

public class InsertionSort {
    
public static void main(String[] args)
    {
        int[] arr = {50, 80, 30, 60, 10, 40, 20, 70};

        // Insertion Sort
        for (int i = 1; i < arr.length; i++)
        {
            int temp = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than temp
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > temp)
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }

        // Print sorted array
        for (int no : arr)
        {
            System.out.print(no + " ");
        }
    }
}
