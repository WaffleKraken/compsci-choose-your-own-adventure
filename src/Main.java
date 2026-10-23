import java.util.Scanner;

/**
 * Starts the game and moves the player from chapter to chapter.
 * Story outline: docs/story/README.md
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Choose Your Own Adventure ===");
        System.out.println();

        // TODO Chapter 1: Crippling Debt (docs/story/01-crippling-debt.md)
        //   The IRS calls: pay $6700 or face jail time.
        //   Choice: get a job or go to the casino.

        // TODO Chapter 2: J*b (docs/story/02-job.md)
        //   Only if the player chose to get a job.
        //   Choice: give up, or head to the casino.

        // TODO Chapter 3: On the Way to the Casino (docs/story/03-road-to-casino.md)
        //   Player finds $65 and walks 50 miles.

        // TODO Chapter 4: Bosses (docs/story/04-bosses.md)
        //   Mugger, Beggar, Kind Samaritan, Hunger, Snake.

        // TODO Chapter 5: Casino Pt. 1 (docs/story/05-casino.md)
        //   Doorman tutorial, then the casino games.

        input.close();
    }
}
