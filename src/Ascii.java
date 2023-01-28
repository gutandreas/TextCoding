public class Ascii {

    private static int symbolToInt(char symbol){
        int symbolAsInt = symbol;
        return symbolAsInt;
    }

    private static String intToBinaryString(int symbolAsInt){
        int currentInt = symbolAsInt;
        String binaryString = "";

        while (currentInt > 0) {

            if (currentInt % 2 == 0) {
                binaryString = "0" + binaryString;
            } else {
                binaryString = "1" + binaryString;
            }

            currentInt = currentInt / 2;
        }

        int missingBits = 7 - binaryString.length();

        for (int i = 0; i < missingBits; i++){
            binaryString = "0" + binaryString;
        }

        return binaryString;
    }

    public static int binaryStringToInt(String binaryString){
        int currentInt = 0;
        for (int i = 0; i < binaryString.length(); i++){
            currentInt = currentInt * 2;
            if (binaryString.charAt(i) == '1'){
                currentInt = currentInt + 1;
            }
        }

        return currentInt;
    }

    public static String textToBinaryString(String text){
        String binaryString = "";
        for (int i = 0; i < text.length(); i++){
            char currentChar = text.charAt(i);
            binaryString += Ascii.intToBinaryString(Ascii.symbolToInt(currentChar));
        }
        return binaryString;
    }

    public static String binaryStringToText(String binaryString){
        String text = "";
        if (binaryString.length()%7 != 0){
            System.out.println("Fehler: Der eingegebene binäre String enthält eine ungültige Anzahl Zeichen!");
        }
        else {
            text = "";
            String currentBinaryString = binaryString;
            while (currentBinaryString.length()>0){
                String nextSymbol = currentBinaryString.substring(0, 7);
                text += (char) binaryStringToInt(nextSymbol);
                currentBinaryString = currentBinaryString.substring(7);
            }
        }
        return text;
    }



}
