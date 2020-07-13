public class Ford extends Auto
{
    public Ford()
    {
        super("Ford");
        setPrice();
        print();
    }
    public void setPrice()
    {
        price = 20000;
    }
    public void print()
    {
        System.out.println("A new " + carType + " costs $" + price);
    }
}
