public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_000_000;
        int period = 1;
        int month = period * 12;
        double pay = service.calculate(credit, month);


        System.out.println("Сумма кредита: " + credit + " руб");
        System.out.println("Срок кредита: " + period + " года");
        System.out.printf("Ежемесячный платеж : %.0f руб", pay);
    }
}