import java.util.*;
public class CeasarII
{
    int n;
    public CeasarII()
    {
        n = 0;
    }
    private char encrypt(char s)
    {
        int c = (int)s + n;
        if(Character.isUpperCase(s))
        {
            if(c>90)
            c = c-26;
            if(c<65)
            c =  c+26;
        }
        if(Character.isLowerCase(s))
        {
            if(c>122)
            c = c-26;
            if(c<97)
            c = c+26;
        }
        char o = (char)c;
        return o;
    }
    private char decrypt(char s)
    {
        int c = (int)s - n;
        if(Character.isUpperCase(s))
        {
            if(c>90)
            c = c-26;
            if(c<65)
            c =  c+26;
        }
        if(Character.isLowerCase(s))
        {
            if(c>122)
                c = c-26;
            if(c<97)
            c = c+26;
        }
        char o = (char)c;
        return o;
    }
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
}