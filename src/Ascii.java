public class Ascii {

    // TODO: Methode implementieren
    public static String intToBinarystring(int symbolAsInt) {
        String binaryString = "";




        return binaryString;
    }

    // TODO: Methode implementieren
    public static int binarystringToInt(String binaryString) {
        int currentInt = 0;




        return currentInt;
    }

    public static String textToBinarystring(String text) {
        String binaryString = "";
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            binaryString += Ascii.intToBinarystring(currentChar);
        }
        return binaryString;
    }

    public static String binarystringToText(String binaryString) {
        String text = "";
        if (binaryString.length() % 7 != 0) {
            System.out.println("Fehler: Der eingegebene binäre String enthält eine ungültige Anzahl Zeichen!");
        } else {
            text = "";
            String currentBinaryString = binaryString;
            while (currentBinaryString.length() > 0) {
                String nextSymbol = currentBinaryString.substring(0, 7);
                text += (char) binarystringToInt(nextSymbol);
                currentBinaryString = currentBinaryString.substring(7);
            }
        }
        return text;
    }


}
