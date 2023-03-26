import java.util.Arrays;

public class Decoder {
    private char offset;

    public Decoder(char offset) {
        this.offset = offset;
    }

    public String decode(String encodedText) {
        char[] table = ReferenceTable.getTable();
        char[] chars = encodedText.toCharArray();

        StringBuilder plainText = new StringBuilder();

        for (char c : chars) {
            int index = Arrays.binarySearch(table, c);
            if (index >= 0) {
                index = (index + Arrays.binarySearch(table, offset)) % table.length;
                plainText.append(table[index]);
            } else {
                plainText.append(c);
            }
        }

        return plainText.toString();
    }
}
