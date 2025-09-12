import java.util.*;

public class BinarySearch {
    public static int binarysearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        while (start<=end) {
            int mid = (start + end)/2;

            //Comparisons
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] > key) { //LEFT
                end = mid - 1;
            } 
            if (numbers[mid] < key) { //RIGHT
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10,12,14};
        // int key = 10;
        System.out.print("Enter key to search: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int index = binarysearch(numbers,key);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Key is at index " + index);
        }
        sc.close();
    }
}