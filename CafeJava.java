public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 2;
        double latte = 4;
        double cappuccino = 5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean orderStatus = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println(customer1 + pendingMessage);
        System.out.println(customer4 + (orderStatus ? (readyMessage + ", " + displayTotalMessage + cappuccino) : (customer4 + pendingMessage)) );


        System.out.println(customer2 + ", " + (displayTotalMessage + (latte + latte)));
        
        if(orderStatus) {
          System.out.println(customer2 + readyMessage);
        }
        else{
          System.out.println(customer2 + pendingMessage);
        }

        System.out.println(customer3 + ", " + (displayTotalMessage + (latte - dripCoffee)));
    }
}
