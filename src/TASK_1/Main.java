package TASK_1;

public class Main {
    public static void main(String[] args) {
        int[] countEvens1 = {2, 1, 2, 3, 4};
        int[] countEvens2 = {2, 2, 0};
        int[] countEvens3 = {1, 3, 5};
        System.out.println("CountEvens 1: " + countEvens(countEvens1) + " Buah");
        System.out.println("CountEvens 2: " + countEvens(countEvens2) + " Buah");
        System.out.println("CountEvens 3: " + countEvens(countEvens3) + " Buah");
    }

    public static int countEvens(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result++;
            }
        }
        return result;
    }
}
