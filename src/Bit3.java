/**
 * From Chapter 5 of Big Java
 *
 * This program generates a random password
 */

public class Bit3 {
    /**
     * Returns a string containing one character randomly chooses from a given string
     * @param characters the string from which to randomly chose a character
     * @return a substring of length 1, taken at a random index
     */
    public static String randomCharacter(String characters){
        int n = characters.length();
        int r = (int) (n*Math.random());
        return characters.substring(r, r+1);
    }

    /**
     * Inserts one string into another at a random position
     * @param str the string into which another string is inserted
     * @param toInsert the string to be inserted
     * @return the result of inserting toInsert into str
     */
    public static String insertAtRandom(String str, String toInsert){
        int n = str.length();
        int r = (int) ((n+1) * Math.random());
        return str.substring(0, r) + toInsert + str.substring(r);
    }

    /**
     * Generates a password
     * @param length the length of the password
     * @return a password with specified length with one digit and one special symbol
     */
    public static String makePassword(int length){
        String password = "";
        // Pick random letters
        for (int i = 0; i < length-2; i++){
            password = password + randomCharacter("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
        }
        // Insert a random digit and special character
        String randomDigit = randomCharacter("0123456789");
        password = insertAtRandom(password, randomDigit);
        String randomSymbol = randomCharacter("+-*/?!@#$%&");
        password = insertAtRandom(password, randomSymbol);
        return password;
    }

    public static void main(String[] args) {
        String result = makePassword(10);
        System.out.println(result);
    }
}
