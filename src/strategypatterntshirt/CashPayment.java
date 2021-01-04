package strategypatterntshirt;

import interfaces.IPayment;

public class CashPayment implements IPayment {

    @Override
    public boolean pay(float amount) {
        System.out.printf("Payment of amount %s was made via Cash \n", amount);
        return true;
    }
}
