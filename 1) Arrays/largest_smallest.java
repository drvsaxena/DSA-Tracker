public class largest_smallest{
    public static int largest(int nums[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            if(largest < nums[i]) {
                largest = nums[i];
            }
        }
        return largest;
    }

    public static int smallest(int nums[]) {
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++) {
            if(smallest > nums[i]) {
                smallest = nums[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int nums[] = {8,5,3,2,4,1};
        System.out.println("Largest number: " + largest(nums));
        System.out.print("Smallest number: " + smallest(nums));
    }
}