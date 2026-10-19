package Arrays;

public class SelectionSort {
    public static void main(String[] args)
    {
        int[] arr = {49, 74, 25, 36, 88, 18, 31};

        int n = arr.length;

        // Selection Sort Algorithm
        for (int i = 0; i < n - 1; i++)
        {
            int minIndex = i;

            // Find the minimum element in unsorted part
            for (int j = i + 1; j < n; j++)
            {
                if (arr[j] < arr[minIndex])
                {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        // Print sorted array
        System.out.print("Sorted Array: ");
        for (int num : arr)
        {
            System.out.print(num + " ");
        }
    }
}
