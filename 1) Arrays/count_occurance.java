import java.util.*;

public class count_occurance {
    public static int cocur(int nums[], int key) {
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == key) {
                count++;
            } 
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = {2,3,4,2,5,3,2,2,7};
        System.out.print("Enter Key: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        System.out.println("Occurance of " + key + " is " + cocur(nums, key));
        sc.close();
    }
}
