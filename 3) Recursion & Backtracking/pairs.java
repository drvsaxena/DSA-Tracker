public class pairs {
    public static void subset(int num[]) {
        for(int i=0; i<num.length; i++) {
            for(int j=i+1; j<num.length; j++) {
                System.out.println("(" + num[i] + "," + num[j] + ")");
            }
        }
    }

    public static void main(String[] args) {
        int num[] = {2,4,6,8};
        subset(num);
    }
}
