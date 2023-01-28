import junit.framework.TestCase;

public class AsciiTest extends TestCase {

    public void testBinaryStringToInt() {
        int intResult1 = Ascii.binaryStringToInt("1000001");
        int intResult2 = Ascii.binaryStringToInt("1111111");
        assert intResult1 == 65;
        assert intResult2 == 127;
    }

    public void testBinaryStringToText() {
        String stringResult1 = Ascii.binaryStringToText("1000001");
        String stringResult2 = Ascii.binaryStringToText("1100001");
        assert stringResult1.equals("A");
        assert stringResult2.equals("a");
    }
}