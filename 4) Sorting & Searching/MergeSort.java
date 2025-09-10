import java.util.Arrays;

public class MergeSort {
    public static void merge(int nums[], int left, int mid, int right) {
        int n1 = mid - left +1;  //SIZE OF LEFT HALF
        int n2 = right - mid;   //SIZE OF RIGHT HALF

        int L[] = new int[n1];
        int R[] = new int[n2];

        //COPY DATA INTO TEMP ARRAYS
        for (int i=0; i<n1; i++) {
            L[i] = nums[left + i];
        }
        for (int j=0; j<n2; j++) {
            R[j] = nums[mid + 1 + j];
        }

        //MERGE BACK INTO NUMS
        int i=0, j=0, k=left;
        
        while (i<n1 && j<n2) {
            if (L[i] <= R[j]) {
                nums[k] = L[i];
                i++;
            } else {
                nums[k] = R[j];
                j++;
            }
            k++;
        }

        //COPY REMAINING ELEMENTS OF L[]
        while (i<n1) {
            nums[k] = L[i];
            i++;
            k++;
        }

        //COPY REMAINING ELEMENTS OF R[]
        while (j<n2) {
            nums[k] = R[j];
            j++;
            k++;
        }
    }
    
    //RECURSIVE FUNCTION
     public static void sort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;   // find the middle point

            // Sort first and second halves
            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Driver code
    public static void main(String[] args) {
        int nums[] = {5, 2, 3, 1, 8, 4};
        System.out.println("Original: " + Arrays.toString(nums));
        sort(nums, 0, nums.length - 1);
        System.out.println("Sorted:   " + Arrays.toString(nums));
    }
}