package vigenere;

public class RunVigenere {

    public static void main(String[] args) {
        String plaintext = "HEJ";
        String keyword = "WHISKY";
        new EncryptDecrypt(plaintext,keyword);

        System.out.println();
        System.out.println("WXYZABC(D)EFGHIJKLMNOPQRSTUV");
        System.out.println("ABCDEFG(H)IJKLMNOPQRSTUVWXYZ");
        System.out.println();
        System.out.println("HIJK(L)MNOPQRSTUVWXYZABCDEFG");
        System.out.println("ABCD(E)FGHIJKLMNOPQRSTUVWXYZ");
        System.out.println();
        System.out.println("IJKLMNOPQ(R)STUVWXYZABCDEFGH");
        System.out.println("ABCDEFGHI(J)KLMNOPQRSTUVWXYZ");

    }

}
