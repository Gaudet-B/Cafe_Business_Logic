import java.util.ArrayList;

public class CafeUtil {

    public String getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return "" + sum;
    }

    public String printPriceChart(String productName, double price, int maxNumber) {
        System.out.println(productName);
        double totalPrice = price;
        for (int i = 1; i <= maxNumber; i++) {
            if (i != 1) {
                totalPrice += price;
                totalPrice -= 0.5;
                System.out.println(String.format("%s - $%.2f \n", i, totalPrice));
            } else {
                System.out.println(String.format("%s - $%.2f \n", i, totalPrice));
            }
        }
        return productName;
    }

    public String getOrderTotal(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return "" + sum;
    }

    public String displayMenu(ArrayList<String> items, ArrayList<Double> prices) {
        for (int i = 0; i < items.size(); i++) {
            System.out.println(String.format("%s %s -- $%.2f \n", i, items.get(i), prices.get(i)));
        }
        return "Done.";
    }

    public ArrayList<String> addCustomer(ArrayList<String> array) {
        System.out.println("Please enter your name: \n");
        String name = System.console().readLine();
        array.add(name);
        System.out.println(String.format("Hello, %s! \n %d", name, array.size()));
        return array;
    }

}