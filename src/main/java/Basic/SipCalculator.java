import java.util.Scanner;

public class SipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter monthly investment amount: ");
        double monthlyInvestmentAmount = scanner.nextDouble();

        System.out.println("Enter expected rate of return (in %): ");
        double expectedRateOfReturn = scanner.nextDouble();

        System.out.println("Enter investment time period (in years): ");
        int investmentTimePeriod = scanner.nextInt();

        double totalInvestment = monthlyInvestmentAmount * 12 * investmentTimePeriod;
        double totalReturn = totalInvestment * (expectedRateOfReturn / 100);
        double maturityAmount = totalInvestment + totalReturn;

        System.out.println("Total Investment: " + totalInvestment);
        System.out.println("Total Return: " + totalReturn);
        System.out.println("Maturity Amount: " + maturityAmount);
    }
}