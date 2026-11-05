public class CommitCafe {


    private static String barista = "Roger"; // STUDENT_TODO_1A: Change name
    // STUDENT_TODO_1B: Add a nickname or title for the barista
    private static String title = "Best Barista"; 



    private static int cups = 0;

    public static void brew(String drink) {

        // STUDENT_TODO_2A: Implement - add 1 to cups & print a message
        cups++;
        System.out.println(title + " " + barista + " is brewing " + drink + "... cups brewed so far: " + cups);  
        // STUDENT_TODO_2B: Add a second brew-related improvement
        if (cups % 5 == 0) {
            System.out.println("That's " + cups + " cups, time for a break!");
        }

        
        System.out.println("CoffeeBot brewed " + drink + ". Hotfixes and hot brews keep production alive.");
        System.out.println("[BOT CHECK] drink length = " + drink.length());

    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}