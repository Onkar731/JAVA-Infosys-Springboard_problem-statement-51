public class FindOddInArray {
    public static int countOdd(int []array) {
        // declaring variable
        int oddNumber = 0;

        // counting odd numbers in a given array
        for(int element : array) {
            if(element % 2 == 1) {
                oddNumber++;
            }
        }

        // returning count of odd numbers present in the array
        return oddNumber;
    }
}