public class insertion_sort {
    public static void insertionSort(int nums[]) {
        for (int i=1; i<nums.length; i++) {
            int curr = nums[i];
            int prev = i-1;
            while (prev>=0 && nums[prev] > curr) {
                nums[prev+1] = nums[prev];
                prev--;
            }
            //Insertion
            nums[prev+1] = curr;
        }
    }
    
    public static void main(String args[]) {
        int nums[] = {8,6,7,5,4,1,3,2};
        insertionSort(nums);
        for(int i=0; i<nums.length; i++) {
            System.out.print(i + " ");
        }
    }
}
