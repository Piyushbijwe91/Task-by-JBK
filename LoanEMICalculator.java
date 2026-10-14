public class LoanEMICalculator {

    // Calculate monthly interest rate
    public static double calculateMonthlyInterestRate(double annualRate) {
        return annualRate / (12 * 100);
    }

    // Calculate EMI
    public static double calculateEMI(double loanAmount, double annualRate, int years) {
        double r = calculateMonthlyInterestRate(annualRate);
        int n = years * 12;

        double emi = (loanAmount * r * Math.pow(1 + r, n))
                   / (Math.pow(1 + r, n) - 1);

        return emi;
    }

    // Calculate total repayment
    public static double calculateTotalPayment(double loanAmount, double annualRate, int years) {
        double emi = calculateEMI(loanAmount, annualRate, years);
        int n = years * 12;

        return emi * n;
    }

    // Calculate total interest
    public static double calculateTotalInterest(double loanAmount, double annualRate, int years) {
        double totalPayment = calculateTotalPayment(loanAmount, annualRate, years);

        return totalPayment - loanAmount;
    }

    public static void main(String[] args) {

        // Sample values
        double loanAmount = 500000; // ₹5,00,000
        double annualRate = 10;     // 10%
        int years = 5;

        double emi = calculateEMI(loanAmount, annualRate, years);
        double totalPayment = calculateTotalPayment(loanAmount, annualRate, years);
        double totalInterest = calculateTotalInterest(loanAmount, annualRate, years);

        System.out.printf("Loan Amount = %.2f\n", loanAmount);
        System.out.printf("Interest Rate = %.2f%%\n", annualRate);
        System.out.printf("Loan Tenure = %d years\n", years);

        System.out.printf("Monthly EMI = %.2f\n", emi);
        System.out.printf("Total Interest = %.2f\n", totalInterest);
        System.out.printf("Total Repayment = %.2f\n", totalPayment);
    }
}