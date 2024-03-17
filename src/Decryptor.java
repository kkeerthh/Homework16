public class Decryptor {

    public String decryptMessage(String message, String  key) {
        byte[] keyBytes = key.getBytes();
        int keyNumber = 0;
        for (byte b : keyBytes) {
            keyNumber += b;
        }
        char[] messageArray = message.toCharArray();
        for (int i = 0; i < messageArray.length; i++) { messageArray[i] = (char) (messageArray[i] ^ keyNumber);
        }
        return  new String(messageArray);
    }
     }

