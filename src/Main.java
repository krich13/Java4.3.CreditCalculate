public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        long creditAmount = 1_000_000;
        double interestRate = 9.99;
        int interestPeriods = 24;

        long monthlyPayment = service.calculate(1_000_000, 9.99, 12);
        System.out.println(monthlyPayment);

        long monthlyPayment2 = service.calculate(1_000_000, 9.99, 24);
        System.out.println(monthlyPayment2);

        long monthlyPayment3 = service.calculate(1_000_000, 9.99, 36);
        System.out.println(monthlyPayment3);
    }
}