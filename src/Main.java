public class Main {

    public static void main(String[] args) {

        String stringBefore = "10010001100001110110011011001101111010000010100001100101111010011001011110010";
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
