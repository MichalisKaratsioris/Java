import java.util.Arrays;

public class IncrementElement {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[1, 2, 3, 4, 5]`
        // - Increment the third element
        // - Print the third element


        int[] numbers = new int[] {1, 2, 3, 4, 5};
        numbers[2]++;
        System.out.println(numbers[2]);
        System.out.println(Arrays.toString(numbers));
    }
}
