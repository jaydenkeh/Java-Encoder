public class Decoder {
    private char offset;

    public Decoder(char offset) {
        this.offset = offset;
    }

    public String decode(String encodedText) {
        String table = ReferenceTable.getTable();
        char[] chars = encodedText.toCharArray();

        StringBuilder plainText = new StringBuilder();

        for (char c : chars) {
            int index = table.indexOf(c);
            if (index >= 0) {
                int shiftedIndex = (index + table.indexOf(offset)) % table.length(); 
                plainText.append(table.charAt(shiftedIndex));
            } else {
                plainText.append(c);
            }
        }

        return plainText.toString();
    }
}
