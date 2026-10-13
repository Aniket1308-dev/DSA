package LinearSearch;

public class L9 {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int[] copy = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[arr.length - 1 - i];
        }

        System.out.println("Copied array in reverse order:");

        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
    }    
}
