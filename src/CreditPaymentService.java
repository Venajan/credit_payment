public class CreditPaymentService {
    public double calculate (int credit, double month){
        double percent = 9.99;
        double monthly = percent / 12 / 100;
        double payment = credit * monthly * Math.pow((1 + monthly), month) / (Math.pow((1 + monthly), month) - 1);
        int pay = (int) payment;
        return pay;
    }
}
