//import java.util.*; Not required.
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
        int encryptedChar = alignShift((int)s + this.CAESER_SHIFT, s);
        return (char) encryptedChar;
    }
    
    /**
    * Decrypts one character using the caeser shift
    * @param s character to be decrypted
    */
    private char decryptChar(char s) {
        int decryptedChar = alignShift((int)s - this.CAESER_SHIFT, s);
        return (char) decryptedChar;
    }
    
    /**
    * Aligns the shift to correct complete the caeser cypher
    * @param rep integer representation of the character
    * @param original original character so that the casing of output can be deicided
    */
    private int alignShift(int rep, char original) {
        if(Character.isUpperCase(s)) {
            if(rep > Z){
                rep -= 26;
            } else if(rep < A) {
                decryptedChar += 26;
            }
        } else if(Character.isLowerCase(s)) {
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
    public String ecrypt(String str) {
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
    
    /*
    Move this to a different file, this doesn't belong here
    void output()
    {
        String in; int s,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter phrase");
        in = sc.nextLine();
        System.out.println("Enter shift");
        n = sc.nextInt();
        System.out.println("Enter 1 to Encrypt or 2 to Decrypt");
        s = sc.nextInt();
        switch(s)
        {
            case 1:
            for(i=0;i<in.length();i++)
            {
                if(Character.isLetter(in.charAt(i)))
                System.out.print(encrypt(in.charAt(i)));
                else
                System.out.print(in.charAt(i));
            }
            break;
            case 2: 
            for(i=0;i<in.length();i++)
            {
                if(Character.isLetter(in.charAt(i)))
                System.out.print(decrypt(in.charAt(i)));
                else
                System.out.print(in.charAt(i));
            }
            break;
            default:
            System.out.println("Invalid choice");
            System.exit(0);
        }
    }
    public static void main()
    {
        CeasarII ob = new CeasarII();
        ob.output();
    }
    */
}
