import java.util.Scanner;

public class MovieTicketPrice {

public static void main(String[] args) 
{
    Scanner scanner = new Scanner(System.in);

System.out.print("Enter your age: ");
int age = scanner.nextInt();

System.out.print("Enter the time of the movie (in 24-hour format HHMM): ");
int time = scanner.nextInt();

int price;

if (age <5 || age >= 60) 
{

price = 0; 

}
 else if (time < 1200) 
 { 
     price = 250; 
 }
else if (time >= 1700 && time <= 2100)
{

price = 300; 
}
else 
{ 
    price = 200;
}    
System.out.println("The price of the movie ticket is: " + price);

scanner.close();
}

}