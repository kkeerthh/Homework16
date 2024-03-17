import java.util.Arrays;
public class DecryptApp {

    public static void main(String[] args) {
        Decryptor decryptor = new Decryptor();
        String message = "-$''$<k<#\"?.k9*))\"?";
        String key = "%&";

        String decryptedMessage = decryptor.decryptMessage(message, key);
        System.out.println("Розшифроване повідомлення: " + decryptedMessage);
    }
}
