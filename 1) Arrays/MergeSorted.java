import java.util.Arrays;

public class MergeSorted {
    public static void main(String args[]) {
        int num1[] = {2,3,4,5};
        int num2[] = {6,7,10,12,15};
        int a = num1.length;
        int b = num2.length;
        int temp[] = new int[a+b];

        for (int i=0; i<a; i++) {
            temp[i] = num1[i];
        }

        for (int i=0; i<b; i++) {
            temp[a+i] = num2[i];
        }

        System.out.println(Arrays.toString(temp));
    }
}
