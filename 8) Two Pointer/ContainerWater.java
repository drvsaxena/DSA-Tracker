public class ContainerWater {
    public static int maxArea(int[] height) {
        int max = 0;
        for (int i=0; i<height.length; i++) {
            for (int j=i+1; j<height.length; j++) {
                int w = j-i;
                int h = Math.min(height[i], height[j]);
                int area = h * w;
                max = Math.max(max, area);
            }
        }
        return max;    
    }

    // public static int maxArea(int[] height) {
    //     int start = 0;
    //     int end = height.length-1;
        
    //     int max = 0;
    //     while (start<end) {
    //         int w = end - start;
    //         int h = Math.min(height[start], height[end]);
    //         int area = h*w;
    //         max = Math.max(max, area);
    //         if (height[start]<height[end]) {
    //             start++;
    //         } else {
    //             end--;
    //         }
    //     }
    //     return max;
    // }

    public static void main(String[] args) {
        int height[] = {1,1};
        System.out.println(maxArea(height));
    }
}
