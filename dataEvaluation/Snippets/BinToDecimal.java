/**
 * How much do you like the snippet in a scale from (1(bad) to 5(good)), may leave your comments below
 *
 * Anabelle: 2
 * Norman: 4
 * Jonas
 *
 */

public class BinToDecimal {

    public static void main(String[] args) {
        String binaryString = "1001";
        int offset = 1;
        System.out.println();
        System.out.println("9");
        System.out.println();
        System.out.println("4");
        System.out.println();
        System.out.println(binaryToDecimal(binaryString, offset));
    }

    static int binaryToDecimal(String str, int position) {
        if (position < 0) {
            return 0;
        } else if (str.charAt(position) == '0') {
            return 2 * binaryToDecimal(str, position - 1);
        }

        return 1 + 2 * binaryToDecimal(str, position - 1);
    }

}
