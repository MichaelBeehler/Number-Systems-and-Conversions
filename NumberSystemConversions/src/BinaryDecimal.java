import java.util.Scanner;

public class BinaryDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {

            // Gather User input
            System.out.println ("Binary <-> Decimal Conversions");
            System.out.println("1. Binary to Decimal");
            System.out.println("2. Decimal to Binary");
            System.out.println("3. Exit");
            String choice = input.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter Binary: ");
                    String binary = input.nextLine();

                    try {
                        char bit;
                        int total = 0;
                        for (int i = binary.length() - 1; i >= 0; i--) {
                            bit = binary.charAt(i);
                            if (bit == '1') {
                                total += (int) Math.pow(2, i);
                            }
                        }
                        System.out.println("Your Decimal is = " + total);

                    }
                    catch (Exception e) {
                        System.out.println("Invalid Binary");
                    }
                    break;

                case "2":
                    System.out.print("Enter a Decimal: ");

                case "3":
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice. Please pick 1, 2, or 3.");
            }
        }
    }
}
