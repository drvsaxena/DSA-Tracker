public class UnionIntersection {
    public static boolean isrepeat(int num[], int size, int key) {
        for(int i=0; i<size; i++) {
            if(num[i] == key) {
                return true;
            }  
        }
        return false;
    }

    public static void union(int num1[], int num2[]) {
        int n1 = num1.length;
        int n2 = num2.length;
        int k = n1 + n2;
        int unionindex = 0;

        int num3[] = new int[k];
        for (int i=0; i<n1; i++) {
            if (!isrepeat(num3, unionindex, num1[i])) {
                num3[unionindex++] = num1[i];
            }
        }
        
        for(int i=0; i<n2; i++) {
            if (!isrepeat(num3, unionindex, num2[i])) {
                num3[unionindex++] = num2[i];
            }
        }

        System.out.print("Union: ");
        for(int i=0; i<unionindex; i++) {
            System.out.print(num3[i] + " ");
        }
        System.out.println(" ");
    }

    public static void intersection(int num1[], int num2[]) {
        int interindex = 0;
        int num4[] = new int[num1.length + num2.length];
        for(int i=0; i<num1.length; i++) {
            for(int j=0; j<num2.length; j++) {
                if(num1[i] == num2[j] && !isrepeat(num4, interindex, num1[i])) {
                    num4[interindex++] = num2[j];
                    break;
                }
            }
        }

        System.out.print("Intersection: ");
        for (int i=0; i<interindex; i++) {
            System.out.print(num4[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int num1[] = {2,2,3,4,5,6};
        int num2[] = {6,6,7,8,9};
        union(num1, num2);
        intersection(num1, num2);
    }
}