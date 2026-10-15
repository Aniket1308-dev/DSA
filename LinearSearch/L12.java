package LinearSearch;

public class L12 {
 
 public static void main(String[] args) {

        int[] arr = {10, 20, 10, 15, 20, 30, 15};

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {
                continue;
            }

            boolean alreadyCounted = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            System.out.println(arr[i] + " occurs " + count + " times");
        }
    }    
}
