public class Main {

    public static void main(String[] args) {

        String stringBefore = "Guten Tag!";
        String stringAfter;
        MODE mode = MODE.ENCODE;

        if (mode == MODE.ENCODE){
            stringAfter = Ascii.textToBinarystring(stringBefore);
        }
        else {
            stringAfter = Ascii.binarystringToText(stringBefore);
        }

        System.out.println(stringAfter);
    }
}
