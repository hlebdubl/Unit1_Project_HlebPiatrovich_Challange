import java.text.DecimalFormat;
import java.text.NumberFormat;


public class TipCalculator {


    private double bill;
    private double tip;
    private int people;
    NumberFormat formatter = new DecimalFormat("#0.00");






    TipCalculator(double bill, double tip, double people)
    {
        bill = this.bill;
        tip = this.tip;
        people = this.people;


    }




    public double allTips(double tip, double bill)
    {
        double totalTip = tip * bill;
        return totalTip;
    }
    public double allTotal(double tip, double bill)
    {
        double totalCost = tip * bill + bill;
        return totalCost;
    }
    public double peopleTip(double tip, double bill, double people)
    {
        double peopleTips = (tip * bill) / people;
        return peopleTips;
    }
    public double totalPerson(double tips, double bill, double people)
    {
        double peopleTotal = (tips * bill + bill) / people;
        return peopleTotal;
    }
}
