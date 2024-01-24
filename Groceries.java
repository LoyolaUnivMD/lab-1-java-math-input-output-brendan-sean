/*
Programmers: Brendan & Sean
Course: CS212, Mr. John
Due Date: 1/28/23
Lab Assignment: 1
Problem Statement: Calculate how much a trip to the grocery store is
Data In: Name of items, amount of the item, cost per item
Data Out: Total cost
Credits: N/A
*/
import java.util.Scanner;
public class Groceries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Output opening statement
        System.out.println("This code will calculate the total cost of your shopping trip. You only have enough room to carry to bags of items.");

        //Prompt and intake name of first item from user
        System.out.println("Please enter the name of the first item you wish to purchase:");
        String itemOne = input.nextLine();
        //Prompt and intake amount of first item from user
        System.out.println("Please enter the number of units of " + itemOne + " you wish to purchase:");
        int amountOne = input.nextInt();
        //Prompt and intake price per unit of first item from user
        System.out.println("Please enter the price per unit of " + itemOne + ":");
        double priceOne = input.nextDouble();
        //Calculate total price of item one
        double totalPriceOne = amountOne * priceOne;

        //Prompt and intake for name of second item
        System.out.println("Please enter the name of the second item you wish to purchase:");
        String itemTwo = input.next();
        //Prompt and intake amount of second item
        System.out.println("How many units of " + itemTwo + " did you purchase?");
        int amountTwo = input.nextInt();
        //Prompt and intake price per unit of second item
        System.out.println("Please enter the price per unit of " + itemTwo + ":");
        double priceTwo = input.nextDouble();
        //Calculate total price of item two
        double totalPriceTwo = amountTwo * priceTwo;

        //Calculate total for entire purchase
        double totalPriceBoth = totalPriceOne + totalPriceTwo;

        //Output receipt with total
        System.out.println("Here is your receipt:");
        System.out.println(itemOne + " " + amountOne + " @ " + priceOne + ": " + totalPriceOne);
        System.out.println(itemTwo + " " + amountTwo + " @ " + priceTwo + ": " + totalPriceTwo);
        System.out.println("TOTAL: $" + totalPriceBoth);
        System.out.println("Thanks for your visit. Have a great day.");
    }

}
