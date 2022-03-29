public class Encrypt {
    final static String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghijklmnopqrastuvwxyz" +
            " абвгдеёжзиклмнопрстуфхцчшщъыьэюя АБВГДЕЁЖЗИКЛМНОПРЕСТУФХЦЧШЩЪЫЬЭЮЯ";
    static char[] charAlphaBet = ALPHABET.toCharArray();

    public String enCrypt(String str, int shift) {
        char[] charSting = str.toCharArray();
        String encrypt = "";
        for(int i = 0; i < charSting.length; i++) {
            for(int j = 0; j < charAlphaBet.length; j++) {
            if(charSting[i] == charAlphaBet[j]) {
                char ch = charAlphaBet[j + shift];
                encrypt += Character.toString(ch);
                break;
                }
            }
        }
        return encrypt;
    }

    public String deCrypt(String str, int shift) {
        char[] charString = str.toCharArray();
        String decrypt = "";
        for(int i = 0; i < charString.length; i++) {
            for(int j = 0; j < charAlphaBet.length; j++) {
                if(charString[i] == charAlphaBet[j]) {
                    char ch = charAlphaBet[j - shift];
                    decrypt += Character.toString(ch);
                    break;
                }
            }
        }
        return decrypt;
    }
}
