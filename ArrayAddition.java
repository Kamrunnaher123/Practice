import java.util.Arrays;
public class ArrayAddition {
    public static void main(String args[]) {
        int[] even = { 2, 4, 6 };
        int[] odd = { 1, 3, 5 };
        int[] result = add(even, odd);
        System.out.println("first array: " + Arrays.toString(even));
        System.out.println("second array: " + Arrays.toString(odd));
        System.out.println("sum of array: " + Arrays.toString(result));
        int[] prime = { 2, 3, 5, 7 };
        result = add(even, prime);
        System.out.println("first array: " + Arrays.toString(even));
        System.out.println("second array: " + Arrays.toString(prime));
        System.out.println("sum of array: " + Arrays.toString(result));
    }
    public static int[] add(int[] first, int[] second) {
        int length = first.length < second.length ? first.length
                : second.length;
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            result[i] = first[i] + second[i];
        }

        return result;
    }

}
