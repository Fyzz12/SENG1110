import java.util.Scanner;

public class PizzaOrderingSystem {
// add in this section all class variables (int, double, ). 14/9
    static char pizzaSize;   // S, M, L
    static int pizzaQuantity;
    static String pizzaType = ""; //margherita, neapolitan, marinara


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
    char addCheese;    // (Y / N)
    static int cheeseSum = 0;
    static final double cheesePrice = 1.5;

    char addOlives;
    static int oliveSum = 0;
    static final double olivePrice = 1;

    char addGarlicBread;
    static int garlicBreadSum = 0;
    static final double garlicBreadPrice = 4;

    char addSoftDrink;
    static int SoftDrinkSum = 0;
    static final double softDrinkPrice = 2.5;

    //POS
    static double orderSubTotal = 0;
    static double addOns = 0;
    static double orderTax = 0;
    static double orderTotal = 0;
    final double taxRate = 0.1;

    //previous order
    Boolean prevOrderExist;
    Boolean prevExtraCheese;
    Boolean prevOlives;
    Boolean prevGarlicBread;
    Boolean prevDrink;
    String prevOrderType;
    char prevOrderSize;
    int prevOrderQuantity;
    double prevAddOns;
    double prevSubTotal;
    double prevTax;
    double prevTotal;


    private static double dailyTotalSales = 0.0;
    private static int totalOrderCount = 0;

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
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
            scanner.nextLine();
            
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
        
        scanner.close(); //maybe delete
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
            System.out.println(" Follow the prompts to order pizza ");

            while(true)
            {
                System.out.println(" Please enter pizza type");
                String pizzaType = scanner.nextLine();

                if (pizzaType.equals("Margherita") || pizzaType.equals("Neapolitan") || pizzaType.equals("Marinara"))
                { System.out.println(" You have chosen " + pizzaType);
                break;

                } else {
                System.out.println(" Invalid pizza type ");
                }
            
            }

            while(true){
                System.out.println(" What size pizza would you like? ");
                char pizzaSize = scanner.next().charAt(0);

                if (pizzaSize == 'S' || pizzaSize == 'M' || pizzaSize == 'L')
                {System.out.println(" You have chosen pizza size " + pizzaSize);
                break;

                } else {
                System.out.println(" Invalid pizza size ");
                }
    
            }        

            while (true){
                System.out.println(" How many pizzas would you like to order? Max 10 ");
                int pizzaQuantity = scanner.nextInt();
                scanner.nextLine();

                if(pizzaQuantity >= 1 && pizzaQuantity <= 10) {
                    System.out.println("you have orderred " + pizzaQuantity + "" + pizzaType +" pizza(s)");
                    break;
                        
            } else {
                System.out.println (" Invalid Input ");
              }
            }

            while (true){
                System.out.println(" Would you like to add cheese? (Y/N)");
                String addCheese = scanner.nextLine();

                    if (addCheese.equals("Y")) {
                        cheeseSum++;
                        addOns += cheesePrice * pizzaQuantity;
                        break;
                    } else if (addCheese.equals("N")) {
                        break;
                    } else {
                        System.out.println(" Invalid input. Please enter Y or N ");
                    }
            }

            while (true){
                System.out.println(" would you like to add olives? (Y/N)");
                String addOlives = scanner.nextLine();

                if (addOlives.equals("Y")) {
                    oliveSum++;
                    addOns += olivePrice * pizzaQuantity;
                    break;
                } else if (addOlives.equals("N")) {
                    break;
                } else {
                    System.out.println(" Invalid input. Please enter Y or N ");
                }
            }
            while (true){

                System.out.println(" would you like to Garlic Bread? (Y/N)");
                String addGarlicBread = scanner.nextLine();

                if (addGarlicBread.equals("Y")) {
                    garlicBreadSum++;
                    addOns += garlicBreadSum;
                    break;
                } else if (addGarlicBread.equals("N")) {
                    break;
                } else {
                    System.out.println(" Invalid input. Please enter Y or N ");
                }
            }

            while (true){
                System.out.println(" would you like to add a soft drink? (Y/N)");
                String addSoftDrink = scanner.nextLine();

                if (addSoftDrink.equals("Y")) {
                    oliveSum++;
                    addOns += softDrinkPrice;
                    break;
                } else if (addSoftDrink.equals("N")) {
                    break;
                } else {
                    System.out.println(" Invalid input. Please enter Y or N ");
                }
            }

            if (pizzaType.equals("Margherita")) {
                if (pizzaSize == 'S') orderSubTotal = 8;
                    else if (pizzaSize == 'M') orderSubTotal = 10;
                        else if (pizzaSize == 'L') orderSubTotal = 12;

            } else if (pizzaType.equals("Neapolitan")) {
                if (pizzaSize == 'S') orderSubTotal = 9;
                    else if (pizzaSize == 'M') orderSubTotal = 11;
                        else if (pizzaSize == 'L') orderSubTotal = 13.5;
            
            } else if (pizzaType.equals("Marinara")) {
                if (pizzaSize == 'S') orderSubTotal = 9.5;
                    else if (pizzaSize == 'M') orderSubTotal = 11.5;
                        else if (pizzaSize == 'L') orderSubTotal = 14;
            }

            // need to do subtotal, addon, tax and final total code. (1 line each)
            // need to print receipt
            // nned to update daily totals




            
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
    