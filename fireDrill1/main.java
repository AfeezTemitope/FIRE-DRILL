import java.util.Scanner;



    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userNumber = input.nextInt();

        boolean result = isEven(userNumber);
        System.out.println("Is the number even? " + result);
    }
