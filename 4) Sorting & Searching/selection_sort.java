public class selection_sort{
    public static void selectionSort(int nums[]) {
        for (int i=0; i<nums.length-1; i++) {
            int minPos = i;
            for (int j=i+1; j<nums.length; j++) {
                if (nums[minPos] > nums[j]) {
                    minPos = j;
                }
            }
            //Swap
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp;
        }
    }
    public static void main(String args[]) {
        int nums[] = {8,6,7,5,4,1,3,2};
        selectionSort(nums);
        for(int i=0; i<nums.length; i++) {
            System.out.print(i + " ");
        }
    }
}

