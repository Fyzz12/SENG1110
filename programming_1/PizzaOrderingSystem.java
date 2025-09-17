import java.util.Scanner;

public class PizzaOrderingSystem {
// add in this section all class variables (int, double, ). 14/9
    char pizzaSize;   // S, M, L
    int pizzaQuantity;
    String pizzaType; //margherita, neapolitan, marinara


    //individual counters and price variables for pizza type and size below
    //Margherita
    int margheritaSmallSum;
    final double price_MargheritaSmall = 8;

    int margheritaMediumSum;
    final double price_MargheritaMedium = 10;

    int margheritaLargeSum;
    final double price_MargheritaLarge = 12;

    //Neapolitan
    int neapolitanSmallSum;
    final double price_NeapolitanSmall = 9;

    int neapolitanMediumSum;
    final double price_NeapolitanMedium = 11;

    int neapolitanLargeSum;
    final double price_NeapolitanLarge = 13.5;

    //Marinara
    int marinaraSmallSum;
    final double price_MarinaraSmall = 9.5;

    int marinaraMediumSum;
    final double price_MarinaraMedium = 11.5;

    int marinaraLargeSum;
    final double price_MarinaraLarge = 14;

    //sides
    Boolean addCheese;    // (Y / N)
    int cheeseSum;
    final double cheesePrice = 1.5;

    Boolean addOlives;
    int oliveSum;
    final double olivePrice = 1;

    Boolean addGarlicBread;
    int garlicBreadSum;
    final double garlicBreadPrice = 4;

    Boolean addSoftDrink;
    int SoftDrinkSum;
    final double softDrinkPrice = 2.5;

    //POS
    double orderSubTotal;
    double orderTax;
    double orderTotal;
    // Unsure at this moment if I need variables for previous order? 14/9
    final double taxRate = 0.1;

    private static double dailyTotalSales = 0.0;
    private static int totalOrderCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            //show menu in console
            System.out.println(" Pizza Ordering System");
            System.out.println("1. View Pizza Menu");
            System.out.println("2. Place New Pizza Order");
            System.out.println("3. Compare Two Pizza Orders");
            System.out.println("4. Simulate Daily Special");
            System.out.println("5. View Daily Sales Report");
            System.out.println("6. View Sales Statistics");
            System.out.println("7. Modify a Previous Order");
            System.out.println("8. Cancel an Order");
            System.out.println("9. Exit");

            // allows user to choose options between 1 and 9
            if (scanner.hasNextInt()){
            int option = scanner.nextInt();
            
                if (option == 1) {
                    viewPizzaMenu();
                }
                else if (option == 2) {
                    newPizzaOrder();
                }
                else if (option == 3){
                    compareOrder();
                }
                else if (option == 4){
                    simulateSpecial();
                }
                else if (option == 5){
                    salesReport();
                }
                else if (option == 6){
                    salesStatistics();
                }
                else if (option == 7){
                    modPreviousOrder();
                }
                else if (option == 8){
                    cancelOrder();
                }
                else if (option == 9){
                    exit = true;
                    System.out.println("Exiting menu, Goodbye");
                }
            else {
                System.out.println("invalid input, please choose a number between 1 - 9");

                }
        } else {
                String invalidInput = scanner.next();
                System.out.println(invalidInput + " is invalid, please enter a number between 1 and 9" );
            }
            }
        
        scanner.close();
        }
        // methods
        public static void viewPizzaMenu(){
            System.out.println(" Pizza Menu ");           
            System.out.println(" Margherita small - $8.00, medium - $10.00, large - $12.00 ");
            System.out.println(" Neapolitan small - $9.00, medium - $11.00, large - $13.50 ");
            System.out.println(" Marinara small - $9.50, medium - $11.50, large - $14.00 ");
            System.out.println(" "); //void to help me read console.
        }

        public static void newPizzaOrder(){
            System.out.println("Under Construction");
        }

        public static void compareOrder(){
            System.out.println("Under Construction");
        }

        public static void simulateSpecial(){
            System.out.println("Under Construction");
        }

        public static void salesReport(){
            System.out.println("Under Construction");
        }

        public static void salesStatistics(){
            System.out.println("Under Construction");
        }
       
        public static void modPreviousOrder(){
            System.out.println("Under Construction");
        }
       
        public static void cancelOrder(){
            System.out.println("Under Construction");
        }

    }
    