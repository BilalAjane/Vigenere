package vigenere;

public class EncryptDecrypt {


    public EncryptDecrypt(String plaintext, String keyword) {

        //Converting plaintext to char array
        char[] msg = plaintext.toCharArray();
        int msgLen = msg.length;
        int i, j;

        // Creating new char arrays
        char[] key = new char[msgLen];
        char[] encryptedMsg = new char[msgLen];
        char[] decryptedMsg = new char[msgLen];

        // Generate key, using keyword in repeat equal to the length of original message (plaintext)

        for (i = 0, j = 0; i < msgLen; ++i, ++j) {
            if (j == keyword.length()) {
                j = 0;
            }
            key[i] = keyword.charAt(j);
        }

        //encryption code
        for (i = 0; i < msgLen; ++i)
            encryptedMsg[i] = (char) (((msg[i] + key[i]) % 26) + 'A');

        //decryption code
        for (i = 0; i < msgLen; ++i)
            decryptedMsg[i] = (char) ((((encryptedMsg[i] - key[i]) + 26) % 26) + 'A');

        System.out.println("Original Message: " + plaintext);
        System.out.println("Keyword: " + keyword);
        System.out.println("Key: " + String.valueOf(key));
        System.out.println();
        System.out.println("Encrypted Message: " + String.valueOf(encryptedMsg));
        System.out.println();
        System.out.println("Decrypted Message: " + String.valueOf(decryptedMsg));


    }

}
