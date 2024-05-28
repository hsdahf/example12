import java.util.Scanner;

public class DiscountCalculator {

public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);

System.out.print("Enter your membership status (premium or non-premium): ");

String membershipStatus = scanner.next();

System.out.print("Enter your total purchase amount: ");

double totalAmount = scanner.nextDouble();

double discount = calculateDiscount(membershipStatus, totalAmount);

if (discount > 0) {

System.out.println("Congratulations! You are eligible for a "+discount+ " % discount.");

}
else 
{
    System.out.println("Sorry, you are not eligible for any discount.");
    }

scanner.close();

}

public static double calculateDiscount(String membershipStatus, double totalAmount) 
{
    double discount = 0;

if

(membershipStatus.equalsIgnoreCase("premium") && totalAmount > 1000) {

discount = 20;

} else if

(membershipStatus.equalsIgnoreCase("no n-premium") && totalAmount > 2000) {

discount = 15;

}

return discount;

}

}