public class CreditPaymentService {
    public long calculate(long creditAmount, double interestRate, int interestPeriods) {
        double monthlyInterestRate = (interestRate / 100) / 12;
        double denominator = 1 - Math.pow(1 + monthlyInterestRate, -interestPeriods);
        long monthlyPayment = (long) (creditAmount * (monthlyInterestRate / denominator));
        return monthlyPayment;
    }
}