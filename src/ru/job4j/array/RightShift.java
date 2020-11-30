package ru.job4j.array;

public class RightShift {

    public static void shift(int[] nums, int count) {
        for (int i = 0; i < count; i++) {
            shift(nums);
        }

    }

    // метод делает сдвиг с шагом 1

    private static void shift(int[] nums) {
        int[] a = new int[nums.length];
        a[a.length - 1] = nums[0];
        a[0] = nums[nums.length - 1];
        System.arraycopy(nums, 0, a, 1, a.length - 1);
        System.arraycopy(a, 0, nums, 0, nums.length);
    }
}
