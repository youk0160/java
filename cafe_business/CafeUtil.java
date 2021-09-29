import java.text.DecimalFormat;
import java.util.ArrayList;

public class CafeUtil {
    public static int getStreakGoal(int numWeeks) {
        int sum=0;
        for(int i=1; i<=numWeeks; i++) sum+=i;
        return sum;
    }

    public static void printPriceChart(String prodName, double price, int maxNum) {
        double discount=0.0;
        System.out.println(prodName);
        for(int i=1; i<=maxNum; i++) {
            if(i>1) {
                discount = .5*(i-1);
            }
            System.out.printf("%d - $%.2f\n",i,(price*i)-discount);
        }
    }

    public static String getOrderTotal(double[] arr) {
        double sum=0.0;
        DecimalFormat f = new DecimalFormat("##.00");

        for (double x : arr) {
            sum += x;
        }
        return f.format(sum);
    }

    public static void displayMenu(ArrayList<String> menu, ArrayList<Double> prices) {
        for(int i=0; i<menu.size(); i++) {
            System.out.printf("%s -- $%.2f\n", menu.get(i), prices.get(i));
        }
    }

    public static void addCustomer(ArrayList<String> customers) {
        String userName="";
        System.out.print("Please enter your name: ");
        while((userName = System.console().readLine()) !="q\n") {
            System.out.println(userName);
            customers.add(userName);
            System.out.printf("Hello, %s! There are %d people ahead of you.\n", userName, customers.size()-1);
            System.out.print("Please enter your name: ");
        }
    }
}