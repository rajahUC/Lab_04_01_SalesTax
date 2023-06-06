public class Main
{
    public static void main(String[] args)
    {
        double purchasePrice = 20.50;
        final double SALES_TAX = 0.05;
        double tax = 0;

        tax = purchasePrice * SALES_TAX;

        System.out.println("The tax for a purchase price of " + purchasePrice + " and a sales tax of " + SALES_TAX + " is " + tax);
    }
}