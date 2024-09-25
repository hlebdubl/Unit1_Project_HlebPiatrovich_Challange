import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;


public class Runner {
    public static void main(String[] args) {


        NumberFormat formatter = new DecimalFormat("#0.00");
        Scanner s = new Scanner(System.in);


        System.out.println("----------------------------------------------");   //Note for inputs
        System.out.println("| Note: No symbols like $ and % inside data! |");
        System.out.println("----------------------------------------------");
        System.out.print("Enter your bill ($): ");
        String money = s.nextLine();
        double bill = Double.parseDouble(money);    //Gets the bill amount and converts it to a double
        System.out.print("Enter tip (%): ");
        String per = s.nextLine();
        double tip = Double.parseDouble(per);        //gets the tip % and converts it to a double
        tip = tip / 100.0;
        System.out.print("Number of people: ");
        String hum = s.nextLine();
        double people = Double.parseDouble(hum);      //gets the num of people and converts it to a double


        TipCalculator wow = new TipCalculator(bill, tip, people);


        System.out.println("----------------------------------");
        System.out.println("|Total tip: $" + formatter.format(wow.allTips(tip, bill)) + "                |");
        System.out.println("----------------------------------");
        System.out.println("|Total bill cost: $" + formatter.format(wow.allTotal(tip, bill)) + "        |");
        System.out.println("----------------------------------");
        System.out.println("|Tips per person: $" + formatter.format(wow.peopleTip(tip, bill, people)) + "         |");
        System.out.println("----------------------------------");
        System.out.println("|Total bill per person: $" + formatter.format(wow.totalPerson(tip, bill, people)) + "   |");
        System.out.println("----------------------------------");   //prints out the values with the format + the $ signs


    }
}
