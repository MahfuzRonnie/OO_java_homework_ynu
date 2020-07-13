public class Chevy extends Auto
{
    public Chevy()
    {
        super("Chevy");
        setPrice();
        print();
    }
    public void setPrice()
    {
        price = 22000;
    }
    public void print()
    {
        System.out.println("A new " + carType + " costs $" + price);
    }
}
