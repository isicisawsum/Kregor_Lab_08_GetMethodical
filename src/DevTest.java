import java.util.Scanner; //importing scanner
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //naming scanner

        //Programs


        //Program 1
        String Name = SafeInput.getNonZeroLengthString(in, "Enter your username"); //asking user for their username
        System.out.println("\nYou said your name was " + Name); //outputting username

        //Program 2
        int integer = (int) SafeInput.getInt(in, "Enter your favorite integer, then your favorite double!");//asking user for an int number
        System.out.println("\nYour favorite integer is " + integer);//outputting user favorite int number
        double doub = SafeInput.getDouble(in, "Now enter your favorite double number"); //asking user for a double number
        System.out.println("\nYour favorite double number is " + doub); //outputting user favorite double number

        //Program 3
        int day = 0;
        int year = (int) SafeInput.getRangedInt(in, "Enter the year of your birth ", 1955, 2015); //finding year user was born in
        int month = (int) SafeInput.getRangedInt(in, "Enter the month you were born ", 1, 12); //finding month user was born in
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = (int) SafeInput.getRangedInt(in, "Enter the day you were born in ", 1, 31); //user was born in a month with 31 days
            break;
            case 2:
                day = (int) SafeInput.getRangedInt(in, "Enter the day you were born in ", 1, 29); //user was born in feb
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = (int) SafeInput.getRangedInt(in, "Enter the day you were born in ", 1, 30); //user was born in a month with 30 days
            break;
        }
        int hour = (int) SafeInput.getRangedInt(in, "Enter the hour you were born ", 0, 23); //finding variable hour
        int minute = (int) SafeInput.getRangedInt(in, "Enter the minute you were born ", 0, 59); //finding variable minute
        System.out.println("You were born on " + month + "/" + day + "/" + year + " at " + hour + ":" + minute); //outputting birth. That sounds weird to say

        //Program 4
        double price = 0; //setting value of price
        double total = 0; //setting value of total
        String YorN = ""; //String to continue
        boolean looped = false; //looping variable
        do {
            price = SafeInput.getRangedDouble(in, "What is the price of your item?", .50, 10.00); //outputting for var price
            total = total + price; //upping the total
            YorN = SafeInput.getYNConfirm(in, "Do you have any more items?"); //asking loop should continue
            if (YorN.equals("Y")){
                looped = false; //loop keeps going
            }
            else {
                looped = true; //loop end
            }
        } while(!looped);
        System.out.printf("The total price is: $%.2f%n", total); //outputting the total price

        //Program 5
        String SSN = ""; //creating variable for SSN
        SSN = SafeInput.getRegExString(in, "Enter your SSN (With dashes in between)", "\\d{3}-\\d{2}-\\d{4}");
        String MNum = ""; //creating variable for MNum
        MNum = SafeInput.getRegExString(in, "Enter your UC Student M number", "(M|m)\\d{8}");
        String MenChoice = ""; //creating variable for MenChoice
        MenChoice = SafeInput.getRegExString(in, "Enter a choice [O,S,V,Q]", "[OoSsVvQq]");

        //Program 6
        System.out.println("Enter your message");
        String msg = in.nextLine();
        SafeInput.prettyHeader(msg);

        //Part Testing
        /**
        *String userName = SafeInput.getNonZeroLengthString(in, "Enter you user name");
        *System.out.println("\nYou said your name is: " + userName);

        *int getInt = SafeInput.getInt(in, "Enter a number");
        *System.out.println("The number you entered was: " + getInt);

        *double getDouble = SafeInput.getDouble(in, "Enter your favorite double number!");
        *System.out.println("The number you entered was: " + getDouble);

        *int favNum = SafeInput.getRangedInt(in, "Enter your favorite number", 1,100);
        *System.out.println("\nYou said your favorite number is: " + favNum);
         */
    }

}