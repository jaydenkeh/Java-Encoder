// Step 1: Create a class named ReferenceTable which contains an array of all the 44 characters in the reference table.

// Step 2: Create a class named Encoder which contains a method named encode that takes in a plainText string and returns the encodedText string.

// In this method, you need to get the first character as the offset character, and shift the reference table by the corresponding number of elements down.

// You can use a for loop to iterate through each character in the plainText string and map it to the corresponding encoded character based on the shifted reference table. If the character is not in the reference table, map it back to the same character.

// Step 3: Create a class named Decoder which contains a method named decode that takes in an encodedText string and returns the plainText string.

// In this method, you need to get the first character as the offset character and shift the reference table by the corresponding number of elements up.

// You can use a for loop to iterate through each character in the encodedText string and map it to the corresponding decoded character based on the shifted reference table. If the character is not in the reference table, map it back to the same character.

// Step 4: Create a main class to test your Encoder and Decoder classes.

// In the main method, you can create an object of Encoder and call its encode method with a plainText string. Then, create an object of Decoder and call its decode method with the encodedText string to get back the original plainText string.

public class ReferenceTable {
    private static final char[] TABLE = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 
    'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '(', ')', '*', '+', ',', '-', '.', '/'};
    
    public static char[] getTable() {
            return TABLE;
    }
    
}