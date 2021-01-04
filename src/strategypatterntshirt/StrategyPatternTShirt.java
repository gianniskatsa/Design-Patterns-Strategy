package strategypatterntshirt;

import models.Color;
import models.Fabric;
import interfaces.IPayment;
import models.TShirt;
import models.Size;

public class StrategyPatternTShirt {
    public static void main(String[] args) {
        int i=1;
        for (Size size: Size.values()){
            for (Color color : Color.values()){
                for (Fabric fabric: Fabric.values()){
                    TShirt tShirt = new TShirt("Marco Polo"+i, color, size, fabric);
                    IPayment payment = new CreditDebitCard();
                    IPayment payment1 = new MoneyBankTransfer();
                    IPayment payment2 = new CashPayment();
                    StrategyPatternTShirt myMainClass = new StrategyPatternTShirt();
                    myMainClass.makeAnOrder(tShirt, payment);
                    myMainClass.makeAnOrder(tShirt, payment1);
                    myMainClass.makeAnOrder(tShirt, payment2);
                    i++;
                }
            }
        }
    }

    public void makeAnOrder(TShirt tShirt, IPayment payment) {
        System.out.println(tShirt);
        if (payment.getClass().getName().equals("strategypatterntshirt.CreditDebitCard")) {
            payment.pay(tShirt.getFabric().getUnitPrice()+tShirt.getColor().getUnitPrice()+tShirt.getSize().getUnitPrice() + 5.0f);
        } else if (payment.getClass().getName().equals("strategypatterntshirt.MoneyBankTransfer")) {
            payment.pay(tShirt.getFabric().getUnitPrice()+tShirt.getColor().getUnitPrice()+tShirt.getSize().getUnitPrice() + 3.0f);
        } else if (payment.getClass().getName().equals("strategypatterntshirt.CashPayment")) {
            payment.pay(tShirt.getFabric().getUnitPrice()+tShirt.getColor().getUnitPrice()+tShirt.getSize().getUnitPrice() + 1.0f);
        }
    }
}
