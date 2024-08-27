import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Tim Gesell
 * @version 8/21/2022
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. Meters to Kilometers");
        System.out.println("8. Kilometers to Meters");
        System.out.println("9. Inches to Feet");
        System.out.println("10. Feet to Inches");
        //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
        //You can add even more if you would like.

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        if (selection == 2)
        {
            System.out.println("Enter Fahrenheit: ");
            double fahrenheit = keyboard.nextDouble();
            keyboard.nextLine();
            double celsius = ((fahrenheit - 32)*5)/9;
            System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees celsius");
        }
        if (selection == 3)
        {
            System.out.println("Enter Feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = feet * 0.3048;
            System.out.println(feet + " feet is " + meters + " meters");
        }
        if (selection == 4)
        {
            System.out.println("Enter Meters: ");
            double meters = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = meters / 0.3048;
            System.out.println(meters + " Meters is " + feet + " Feet");
        }
        if (selection == 5) // oz to mil
        {
            System.out.println("Enter Ounces: ");
            double ounces = keyboard.nextDouble();
            keyboard.nextLine();
            double milliliters = ounces * 29.57353;
            System.out.println(ounces + " Ounces is " + milliliters + " Milliliters");
        }
        if (selection == 6)
        {
            System.out.println("Enter Milliliters: ");
            double milliliters = keyboard.nextDouble();
            keyboard.nextLine();
            double ounces = milliliters / 29.57353;
            System.out.println(milliliters + " Milliliters is " + ounces + " Ounces");
        }
        if (selection == 7) // m to km
        {
            System.out.println("Enter Meters: ");
            double meters = keyboard.nextDouble();
            keyboard.nextLine();
            double kilometers = meters / 1000;
            System.out.println(meters + " Meters is " + kilometers + " Kilometers");
        }
        if (selection == 8)
        {
            System.out.println("Enter Kilometers: ");
            double kilometers = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = kilometers * 1000;
            System.out.println(kilometers + " Kilometers is " + meters + " Meters");
        }
        if (selection == 9) // in to ft
        {
            System.out.println("Enter Inches: ");
            double inches = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = inches / 12;
            System.out.println(inches + " Inches is " + feet + " Feet");
        }
        if (selection==10)
        {
            System.out.println("Enter Feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double inches = feet * 12;
            System.out.println(feet + " Feet is " + inches + " Inches");
        }
    }
}