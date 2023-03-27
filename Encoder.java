public class Encoder {
    private char offset;

    // constructor to set the 'offset' field of the Encoder object to the value of the 'offset' argument 
    public Encoder(char offset) {
        this.offset = offset;
    }

    public String encode(String plainText) {
        String table = ReferenceTable.getTable();
        char[] chars = plainText.toCharArray(); // converts the given plain text input by the user into an array of characters of the text 

        StringBuilder encodedText = new StringBuilder(); 

        for (char c : chars) {
            int index = table.indexOf(c);
            if (index >= 0) {
                int shiftedIndex = (index - table.indexOf(offset) + table.length()) % table.length(); 
                // Subtracting the index of the offset character from the index of the plaintext character in the table array
                // shifts the index of the plaintext character by the same amount as the offset character

                // However, there could be cases whereby the resulting index is negative, so we need to add the length
                // of the table array to the result before taking the modulus
                encodedText.append(table.charAt(shiftedIndex));
            } else {
                encodedText.append(c);
            }
        }

        return encodedText.toString();
    }
}
