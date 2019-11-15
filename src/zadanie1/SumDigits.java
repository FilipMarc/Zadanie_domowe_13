package zadanie1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        List<Integer> list = createList();

        printReversedList(list);
        System.out.println(listSum(list));
        printMaxElement(list);
        printMinElement(list);

    }

    private static List<Integer> createList() {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        int number = 0;
        do {
            System.out.println("Wprowadź liczbę");

            number = sc.nextInt();
            sc.nextLine();
            if (number >= 0) {
                numbers.add(number);
            }
            System.out.println("Aby zakończyć listę wprowadź liczbę ujemną");
        } while (number >= 0);

        sc.close();
        return numbers;
    }

    private static void printReversedList(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    private static String listSum(List<Integer> list) {
        int sum = 0;
        String sign = "";

        for (Integer number : list) {
            sum += number;
            if (!number.equals(list.get(list.size() - 1))) {
                sign += number + "+";
            } else {
                sign += number + "=" + sum;
            }
        }
        return sign;
    }

    private static void printMaxElement(List<Integer> list) {
        int max = list.get(0);
        for (Integer digit : list) {
            if (max < digit)
                max = digit;
        }
        System.out.println("Największa liczba: " + max);
    }

    private static void printMinElement(List<Integer> list) {
        int max = list.get(0);
        for (Integer digit : list) {
            if (max > digit)
                max = digit;
        }
        System.out.println("Najmniejsza liczba: " + max);
    }
}
