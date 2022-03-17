import java.util.Scanner;

public class DragonCave {
    static final String setBoldText = "\033[0;1m";
    static final String setPlainText = "\033[0;0m";

    public static void main(String[] args) {

        System.out.println("You are in a land full of dragons. In front of you, you see two caves. In One cave, the dragon is friendly and will share his treasure with you. \n" +
                " The other dragon is greedy and hungry and will eat you on sight. Which cave will you go into? ( 1 or 2)");
        boolean flag = true;
        DragonCave dragonCave = new DragonCave();

        while (flag) {
            try {
                String userInput = dragonCave.getScannerOutput();
                if (userInput.equals("1") ||userInput.equals("2") )   {
                    flag = false;
                }
                System.out.println(setPlainText + dragonCave.getMessage(userInput));

            } catch (Exception e) {
                System.out.println("Exception is: "+ e.getMessage());
            }
        }
    }

    /**
     * Getting the user input from the Terminal
     * @return
     */

    public String getScannerOutput(){
        Scanner input = new Scanner(System.in);
        String userInput = input.next();
        System.out.println("Your choice:" + setBoldText + userInput);
        return userInput;
    }

    /**
     * Output the message based on User's Input
     * @param input
     * @return
     */

    public String getMessage(String input) {
        String output = "";

        if (input.equals("1")) {
            output = "You approach the cave..It is dark and spooky...A large dragon jumps out in front of you! He opens his jaw and...Gobbles you down in one bite \n";
        } else if (input.equals("2")) {
            output = "You approach the cave..It is full of shimmering light with treasures at every sight...A friendly dragon looks into your eyes and you become friends.." +
                    "He shares his \n" + "treasures with you...You are rich for life with friendship and treasures!";
        }
        else {
            output = "You have entered wrong input please enter 1 or 2.";
        }
        return output;
    }
}
