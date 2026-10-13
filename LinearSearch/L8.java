package LinearSearch;

public class L8 {
   
    public static void main(String[] args) {

        int[] arr = {10, 15, 20, 25, 30, 35};

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }

        int[] odd = new int[count];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                odd[j] = arr[i];
                j++;
            }
        }

        System.out.println("Odd elements:");

        for (int i = 0; i < odd.length; i++) {
            System.out.print(odd[i] + " ");
        }
    }    
}
