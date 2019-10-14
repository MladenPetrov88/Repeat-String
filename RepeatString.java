import java.util.Scanner;

public class RepeatString {

    public static void repeatString(String input, int count) {
        String[] array = new String[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = input;
        }
        System.out.print(String.join("", array));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int count = scanner.nextInt();

        repeatString(input, count);
    }
}
