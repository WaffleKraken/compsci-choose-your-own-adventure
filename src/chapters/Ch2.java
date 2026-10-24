package chapters;

import java.util.Scanner;

public class Ch2 {
    public static void main(String[] args) {
        Scanner bigmac = new Scanner(System.in);
       int balance = 0;
       int job = 0;
        System.out.println("Chapter 2: J*b");
        System.out.println("Press enter to continue...");
        bigmac.nextLine();
        System.out.println("'Welcome to McDonalds!' your boss exclaims.");
        bigmac.nextLine();
        System.out.println("You are the new cashier at McDonalds and your first day is about to begin.");
        bigmac.nextLine();
        System.out.println("Your first customer approaches you and orders 600 water cups.");
        bigmac.nextLine();
        System.out.println("You sigh and ask your boss if you have to obey this, to which he responds with 'yes'.");
        bigmac.nextLine();
        System.out.println("To start earning money, you must type 'take order' to take the customer's order.");
    String input = bigmac.nextLine();
        if (input.equals("take order"))
        {
        balance = balance++;
        job = job + 1;
        if (job % 10 == 0 && job != 0)
        {
                System.out.println("You have been working for a while and feel the urge to quit and gamble for money.");
                System.out.println("Do you want to quit your jobs and gambke for money? (yes/no)");
                    if (bigmac.nextLine().equals("yes"))
                    {
                        System.out.println("You quit your job and gamble for money.");
                        // How do I send the user to gambling chapter?
        }
        if (bigmac.nextLine().equals("no"))
        {
            System.out.println("You continue to work at McDonalds.");
// how do i loop player so they continue to make money?
        }
        }
        System.out.println("You take the customer's order and earn one dollar.");
        System.out.println("You now have $" + balance + ".");
        }
    }
}
