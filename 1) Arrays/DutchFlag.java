import java.util.Arrays;

public class DutchFlag{
    public static void dutchFlag(int nums[]) {
        int ZCOUNT = 0;
        int OCOUNT = 0;
        //COUNTING
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 0) {
                ZCOUNT++;
            }
            if (nums[i] == 1) {
                OCOUNT++;
            }
        }
        //INSERTION
        for (int i=0; i<ZCOUNT; i++) {
            nums[i] = 0;
        }
        for (int i=ZCOUNT; i<ZCOUNT+OCOUNT; i++) {
            nums[i] = 1;
        }
        for (int i=ZCOUNT+OCOUNT; i<nums.length; i++) {
            nums[i] = 2;
        }
    }

    public static void main(String[] args) {
        int nums[] = {0,1,1,0,2,1,0,2};
        dutchFlag(nums);
        System.out.println(Arrays.toString(nums));
    }
}