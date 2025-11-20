public class Solution {
    public static int secondLargest(int[] arr) {
        Integer first = null;
        Integer second = null;

        for (int n : arr) {
            if (first != null && n == first) continue;

            if (first == null || n > first) {
                second = first;
                first = n;
            } else if ((second == null || n > second) && n < first) {
                second = n;
            }
        }

        return (second == null) ? -1 : second;
    }

    public static void main(String[] args) {
        System.out.println(secondLargest(new int[]{3,5,2,5,6,6,1})); // 5
        System.out.println(secondLargest(new int[]{7,7,7}));         // -1
    }
}
