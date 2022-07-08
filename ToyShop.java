package JavaBasics.ConditionalStatements.Exercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceExcursion = Double.parseDouble(scanner.nextLine());
        int countPuzzle = Integer.parseInt(scanner.nextLine());
        int countDoll = Integer.parseInt(scanner.nextLine());
        int countTeddyBear = Integer.parseInt(scanner.nextLine());
        int countMinions = Integer.parseInt(scanner.nextLine());
        int countTrucks = Integer.parseInt(scanner.nextLine());

        double sumSales = countPuzzle * 2.60 + countDoll * 3 + countTeddyBear * 4.10
                + countMinions * 8.20 + countTrucks * 2;
        int countToys = countPuzzle + countDoll + countTeddyBear + countMinions + countTrucks;
        double sumLeft = 0.00;

        if (countToys < 50) {
            sumLeft = sumSales * 0.90;
        }
        if (countToys >= 50) {
            sumLeft = (sumSales - sumSales * 0.25) * 0.90;
        }
        if (sumLeft >= priceExcursion) {
            System.out.printf("Yes! %.02f lv left.", (sumLeft - priceExcursion));
        } else {
            System.out.printf("Not enough money! %.02f lv needed.", (priceExcursion - sumLeft));
        }
    }
}
