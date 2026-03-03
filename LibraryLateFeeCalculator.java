import java.util.Scanner;

public class LibraryLateFeeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int daysLate = sc.nextInt();
        String memberType = sc.next();

        double total = 0;

        if (daysLate <= 0) {
            total = 0;
        } else {
            int remainingDays = daysLate;

            int firstSlab = Math.min(remainingDays, 5);
            total += firstSlab * 2;
            remainingDays -= firstSlab;

            if (remainingDays > 0) {
                int secondSlab = Math.min(remainingDays, 5);
                total += secondSlab * 5;
                remainingDays -= secondSlab;
            }

            if (remainingDays > 0) {
                total += remainingDays * 10;
            }
        }

        if (memberType.equals("PREMIUM")) {
            total = total * 0.8;
        }

        if (total > 500) {
            total = 500;
        }

        System.out.println("Final Fine: ₹" + (int)total);
        sc.close();
    }
}