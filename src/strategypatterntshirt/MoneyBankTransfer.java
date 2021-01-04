package strategypatterntshirt;

import interfaces.IPayment;

public class MoneyBankTransfer implements IPayment {

    @Override
    public boolean pay(float amount) {
        System.out.printf("Payment of amount %s was made via Bank Transfer \n", amount);
        return true;
    }
}
