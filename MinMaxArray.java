import java.util.Arrays;

class MinMaxArray {
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 5, 8, 6};

        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();

        System.out.println("Min: " + min); // 1
        System.out.println("Max: " + max); // 8
    }
}
