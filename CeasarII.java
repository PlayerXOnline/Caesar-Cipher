public class CeasarII
{
    private static final int A = (int)'A';
    private static final int Z = (int)'Z';
    private static final int a = (int)'a';
    private static final int z = (int)'z';

    private final int CAESER_SHIFT;

    /**
     * Default constructor : Creates an instance of CaeserII class, which encrypts strings using caeser cipher technique
     * @param caeserShift shift to apply, so that character is encrypted using caeser shift
     */
    public CeasarII(int caeserShift) {
        this.CAESER_SHIFT = caeserShift % 26;
    }

    /** 
     * Encryprts one character using the caeser shift
     * @param s character to be encrypted
     */
    private char encryptChar(char s) {
        int encryptedChar = Character.isAlphabetic(s) ? alignShift((int)s + this.CAESER_SHIFT, s) : s;
        return (char) encryptedChar;
    }

    /**
     * Decrypts one character using the caeser shift
     * @param s character to be decrypted
     */
    private char decryptChar(char s) {
        int decryptedChar = Character.isAlphabetic(s) ? alignShift((int)s - this.CAESER_SHIFT, s) : s;
        return (char) decryptedChar;
    }

    /**
     * Aligns the shift to correct complete the caeser cypher
     * @param rep integer representation of the character
     * @param original original character so that the casing of output can be deicided
     */
    private int alignShift(int rep, char original) {
        if(Character.isUpperCase(original)) {
            if(rep > Z){
                rep -= 26;
            } else if(rep < A) {
                rep += 26;
            }
        } else if(Character.isLowerCase(original)) {
            if(rep > z) {
                rep -= 26;
            } else if(rep < a) {
                rep += 26;
            }
        }
        return rep;
    }

    /**
     * Encrypts the given string using the caeser cipher
     * @param str String to be encrypted
     */
    public String encrypt(String str) {
        int strLen = str.length();
        StringBuilder encrypted = new StringBuilder(strLen);
        for (int i = 0; i < strLen; i++) {
            encrypted.append(encryptChar(str.charAt(i)));
        }
        return encrypted.toString();
    }

    /**
     * Decrypts the given string using caeser cipher
     * @param str String to decrypt
     */
    public String decrypt(String str) {
        int strLen = str.length();
        StringBuilder decrypted = new StringBuilder(strLen);
        for (int i = 0; i < strLen; i++) {
            decrypted.append(decryptChar(str.charAt(i)));
        }
        return decrypted.toString();
    }
}
