package be.vdab.OefArrList;

public class Loan {
    private double amount;
    private double interestrate = 2.5;
    private int looptijd = 240;

    public Loan(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInterestrate() {
        return interestrate;
    }

    public void setInterestrate(double interestrate) {
        this.interestrate = interestrate;
    }

    public int getLooptijd() {
        return looptijd;
    }

    public void setLooptijd(int looptijd) {
        this.looptijd = looptijd;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "amount=" + amount +
                ", interestrate=" + interestrate +
                ", looptijd=" + looptijd +
                '}';
    }
}
