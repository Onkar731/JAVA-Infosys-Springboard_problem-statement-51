import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        String inputString = sc.nextLine();

        // extracting element from the string
        int []array = Arrays.stream(inputString.split(",")).mapToInt(Integer::parseInt).toArray();

        // priting count of odd numbers present in an array
        System.out.println(FindOddInArray.countOdd(array));

        // closing resource
        sc.close();
    }
}