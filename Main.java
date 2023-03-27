import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the offset character: ");
        char offset = scanner.next().charAt(0);
        Encoder encoder = new Encoder(offset);
        Decoder decoder = new Decoder(offset);

        while (true) {
            System.out.println("Choose an option (enter just the number):");
            System.out.println("1. Encode a message");
            System.out.println("2. Decode a message");
            System.out.println("3. Exit");
            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                System.out.print("Enter the message to encode: ");
                String message = scanner.nextLine();
                String encodedMessage = encoder.encode(message);
                System.out.println("Encoded message: " + encodedMessage);
            } else if (option == 2) {
                System.out.print("Enter the message to decode: ");
                String message = scanner.nextLine();
                String decodedMessage = decoder.decode(message);
                System.out.println("Decoded message: " + decodedMessage);
            } else if (option == 3) {
                break;
            } else {
                System.out.println("Invalid option, please try again.");
            }
        }
        
        scanner.close();
    }
}
