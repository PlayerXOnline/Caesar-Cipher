import java.util.Scanner;
public class Main {
    private static final Scanner SC = new Scanner(System.in);
    public static void main(String... args) {
        System.out.println("Enter 0 if you want to encrypt and 1 if you wish to decrypt");
        switch(SC.nextInt()) {
            case 0 : Main.encrypt();
                break;
            case 1 : Main.decrypt();
                break;
            default : System.err.println("Invalid choice");
        }
    }

    public static void encrypt() {
        System.out.println("Enter the sentence you want to encrypt");
        String original = SC.nextLine();
        System.out.println("Enter the caeser shift");
        int shift = SC.nextInt();
        CeasarII encrypter = new CeasarII(shift);
        String encrypted = encrypter.encrypt(original);
        System.out.printf("The encypted version looks like %s\n", encrypted);
    }

    public static void decrypt() {
        System.out.println("Enter the sentence you want to decrypt");
        String original = SC.nextLine();
        System.out.println("Enter the caeser shift");
        int shift = SC.nextInt();
        CeasarII encrypter = new CeasarII(shift);
        String encrypted = encrypter.decrypt(original);
        System.out.printf("The decrypted version looks like %s\n", encrypted);
    }
}
