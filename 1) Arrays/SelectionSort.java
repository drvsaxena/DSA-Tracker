public class SelectionSort {
    public static void selsort(int nums[]) {
        for(int i=0; i<nums.length; i++) {
            int minIndex = i;
            for (int j=i+1; j<nums.length; j++) {
                if(nums[minIndex] > nums[j] ) {
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
    }

    public static void main(String[] args) {
        int nums[] = {5,4,3,2,1};
        selsort(nums);
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
