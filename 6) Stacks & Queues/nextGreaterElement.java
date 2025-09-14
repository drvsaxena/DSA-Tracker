import java.util.Stack;

class NextGreaterElement {
    public static int[] greaterelements (int arr[]) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> s = new Stack<>();

        for(int i=n-1; i>=0; i--) {
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            } 

            if (s.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = s.peek();
            }

            s.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {4,5,2,25};
        int result[] = greaterelements(arr);

        System.out.println("Next Greater Elements: ");
        for(int i=0; i < result.length; i++) {
            System.out.println(result[i] + " ");
        }
    }
}
