public class CheckSorted {
    public static boolean issorted(int nums[]) {
        boolean asc = true;
        boolean dsc = true;
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] > nums[i+1]) {
                asc = false;
            }
            if(nums[i] < nums[i+1]) {
                dsc = false;
            }
        }
        return asc || dsc;
    }

    public static void main(String[] args) {
        int nums[] = {2,3,4,5,6,7,8};
        // int nums[] = {8,5,4,3,2,1};
        // int nums[] = {7,1,8,5,2,9,};
        if(issorted(nums)) {
            System.out.println("Sorted");   
        } else {
            System.out.println("Not Sorted");
        }
    }
}
