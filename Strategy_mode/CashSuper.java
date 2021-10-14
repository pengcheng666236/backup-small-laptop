package Strategy_mode;

public abstract class CashSuper {
    public abstract double acceptCash(double money);
}
class CashNormal extends CashSuper{

    @Override
    public double acceptCash(double money) {
        return money;
    }
}
class CashRebate extends CashSuper{
    private double rebatePercent = 0;

    public CashRebate(double rebatePercent) {
        this.rebatePercent = rebatePercent;
    }

    @Override
    public double acceptCash(double money) {
        return money * rebatePercent;
    }
}
class CashReturn extends CashSuper{
    private double cashRequirement = 0;
    private double cashReturn = 0;

    public CashReturn(double cashRequirement, double cashReturn) {
        this.cashRequirement = cashRequirement;
        this.cashReturn = cashReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if(money > cashRequirement){
            result = money-(money/cashRequirement)*cashReturn;
        }
        return result;
    }
}
