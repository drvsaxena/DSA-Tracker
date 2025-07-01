public class bubble_sort{
    public static void bubsort(int nums[]) {
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums.length-i-1; j++) {
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {5,4,3,2,1};
        bubsort(nums);
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}