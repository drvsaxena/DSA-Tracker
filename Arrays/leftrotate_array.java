public class leftrotate_array {
    public static void rotate(int nums[]){
        if(nums.length == 0){
            return;
        }

        int first = nums[0];
        for(int i=0; i<nums.length-1; i++) {
            nums[i] = nums[i+1];
        }
        nums[nums.length - 1] = first;
    }
    
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        rotate(nums);
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
