public class merge_sorted_arrays {
    public static void merge(int num1[], int  num2[]) {
        int n=num1.length, m = num2.length;
        int k = n + m;
        int newarr[] = new int[k];

        int i=0, j=0, l=0;

        while(i<n && j<m) {
            if(num1[i] < num2[j]) {
                newarr[l++] = num1[i++];
            } else {
                newarr[l++] = num2[j++];
            }
        }

        while(i<n) {
            newarr[l++] = num1[i++];
        }

        while(j<m) {
            newarr[l++] = num2[j++];
        }

        for(int t=0; t<k; t++) {
            System.out.print(newarr[t] + " ");
        }
    }

    public static void main(String[] args) {
        int num1[] = {1,3,5,7};
        int num2[] = {2,4,6,8};
        merge(num1, num2);
    }
}
