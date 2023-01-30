import junit.framework.TestCase;

public class AsciiTest extends TestCase {

    public void testBinaryStringToInt() {
        int intResult1 = Ascii.binarystringToInt("1000001");
        int intResult2 = Ascii.binarystringToInt("1111111");
        assert intResult1 == 65;
        assert intResult2 == 127;
    }

    public void testIntToBinarystring() {
        String stringResult1 = Ascii.intToBinarystring(65);
        String stringResult2 = Ascii.intToBinarystring(5);
        assert stringResult1.equals("1000001");
        assert stringResult2.equals("0000101");
    }
}