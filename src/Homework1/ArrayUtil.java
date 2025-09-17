package Homework1;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        System.out.println(numbers[0]);
        System.out.println(numbers[8]);
        System.out.println("zangvaci erkarutyun" + numbers.length);
        System.out.println(numbers[6]);


        int n = numbers.length;

        if (n < 2) {
            System.out.println("can't print middle values");
        } else {
            int middle = n / 2;
            if (n % 2 == 0) {
                System.out.println("middle values" + numbers[middle - 1] + " " + numbers[middle]);
            } else {
                System.out.println("middle value" + numbers[middle]);
            }
            int positiveCount = 0;
            int negativeCount = 0;
            for (int num : numbers) {
                if (num > 0) {
                    positiveCount++;
                } else if (num < 0) {
                    negativeCount++;
                }
            }
            System.out.println("drakan" + positiveCount);
            System.out.println("bacasakan" + negativeCount);


            int sum = 0;
            for (int n1 : numbers) {
                sum += n1;
            }
            double average = (double) sum / numbers.length;
            System.out.println("gumary" + sum);
            System.out.println("mijin tvabanakany" + average);

        }

    }
}
