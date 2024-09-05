public class SumEvenNumbers {
    public static void main(String[] args) {
        int sum = 0;

        // Loop through even numbers from 2 to 100
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }

        System.out.println("The sum of all even numbers from 1 to 100 is: " + sum);
    }
}
