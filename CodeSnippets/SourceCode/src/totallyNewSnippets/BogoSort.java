package totallyNewSnippets;

/**
 * How much do you like the snippet in a scale from (1(bad) to 5(good)), may leave your comments below
 *
 * Annabelle:3
 * Norman: 3 (discuss identifiers, e.g., "array" instead of "field"?)
 * Jonas
 *
 */

import java.util.Random;

public class BogoSort {

    public static void main(String[] args) {
        int[] field = {23, 42, 137, 12, 54};
        int[] result = bogo(field);
        for (int element : result) {
            System.out.print(element + " ");
        }
    }

    public static int[] bogo(int[] field) {
        Random r = new Random();

        while (!isFinished(field)) {
            int a = r.nextInt(field.length);
            int b = r.nextInt(field.length);

            int temp = field[a];
            field[a] = field[b];
            field[b] = temp;
        }

        return field;
    }

    public static boolean isFinished(int[] field) {
        for (int i = 0; i < field.length - 1; i++) {
            if (field[i] > field[i + 1]) {
                return false;
            }
        }
        return true;
    }

}
