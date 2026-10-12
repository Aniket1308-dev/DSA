package LinearSearch;

public class L3EI {
    public static void main(String[] args) {
    int[] arr = {10, 20, 30, 40, 50};
    int sum = 0;

    for (int i = 0; i < arr.length; i++) 
    {
        if (i % 2 == 0) 
        {
            sum = sum + arr[i];
        }
    }
     System.out.println("sum of elements at even indices = " + sum);
}
}