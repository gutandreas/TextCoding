public class Main {

    public static void main(String[] args) {

        String stringBefore = "Guten Tag!";
        String stringAfter;
        MODE mode = MODE.ENCODE;

        if (mode == MODE.ENCODE){
            stringAfter = Ascii.textToBinaryString(stringBefore);
        }
        else {
            stringAfter = Ascii.binaryStringToText(stringBefore);
        }

        System.out.println(stringAfter);
    }
}
