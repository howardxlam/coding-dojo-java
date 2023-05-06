import java.util.ArrayList;
import java.text.DecimalFormat;

public class CafeUtil{

    public static String currencyFormat(String pattern, double value){
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        String output = myFormatter.format(value);
        return output;
    }

    public int getStreakGoal(int numWeeks) {
        int output = 0;
        for (int i = 0; i <= numWeeks; i++){
            output += i;
        }
        return output;
    }

    public double getOrderTotal(double[] intArr) {
        double output = 0;
        for (int i = 0; i < intArr.length; i++) {
            output += intArr[i];
        }
        return output;
    }

    /*

    public void displayMenu(ArrayList<String> menu){
        for (int i = 0; i < menu.size(); i++){
            System.out.println(i + " " + menu.get(i));
        }

        // Enhanced For Loop
        // for (String menuItem : menu) {
        //     System.out.println(menuItem);
        // }
    }

    */

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("There are " + customers.size() + " people in front of you");
        customers.add(userName);
        System.out.println(customers);

    }

    //Ninja Bonus

    public void printPriceChart(String product, double price, int maxQuantity){
        System.out.println(product);
        for (int i = 0; i < maxQuantity; i++){
            System.out.println(price + "/bag");
            double total = price * (i + 1);
            String formattedPrice = currencyFormat("$##.00", total);
            System.out.println((i + 1) + " - " + formattedPrice);
            price -= 0.50;
        }
    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices){
        if (menuItems.size() != prices.size()){
            return false;
        }
        for (int i = 0; i < menuItems.size(); i++){
            
            System.out.println(i + " " + menuItems.get(i) + " -- " + currencyFormat("$##.00", (prices.get(i))));
        }
        return true;
    }

}