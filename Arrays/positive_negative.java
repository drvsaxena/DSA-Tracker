import java.util.*;

public class positive_negative {
    public static void rearra(int nums[]) {
       ArrayList <Integer> pos = new ArrayList<>(); 
       ArrayList <Integer> neg = new ArrayList<>();

       for(int i=0; i<nums.length; i++) {
            if(nums[i] >= 0) {
                pos.add(nums[i]);
            } else {
                neg.add(nums[i]);
            }
       }

       int i=0, p=0, n=0;
       boolean turnPositive = true;

       while(p < pos.size() && n < neg.size()) {
            if(turnPositive) {
                nums[i++] = pos.get(p++);
            } else {
                nums[i++] = neg.get(n++);
            }
            turnPositive = !turnPositive;
       }

       while (p<pos.size()) {
            nums[i++] = pos.get(p++);
       }
       while (n<neg.size()) {
            nums[i++] = neg.get(n++);
       }

       for(int k=0; k<nums.length; k++) {
            System.out.print(nums[k] + " ");
       }
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, -3, -1, -2, 3};
        rearra(nums);
    }
}
