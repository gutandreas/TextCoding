public class Main {

    public static void main(String[] args) {

        String stringBefore = "100100011000011101100110110011011110100000101000010001011110100110010111100100100001";
        String stringAfter;
        MODE mode = MODE.DECODE;

        if (mode == MODE.ENCODE){
            stringAfter = Ascii.textToBinaryString(stringBefore);
        }
        else {
            stringAfter = Ascii.binaryStringToText(stringBefore);
        }

        System.out.println(stringAfter);
    }
}
