public class RotateByK {
    public static void rotatek(int nums[], int k) {
        int n = nums.length;
        k = k%n;
        int temp[] = new int[k];
        for(int i=0; i<k; i++){
            temp[i] = nums[i]; 
        }

        for(int i=k; i<n; i++){
            nums[i-k] = nums[i];
        }

        for(int i=0; i<k; i++){
            nums[n-k+i] = temp[i];
        }
        
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8};
        int k = 2;
        rotatek(nums,k);
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }        
    }
}
