public abstract class Auto
{
    protected String carType;
    protected double price;
    public Auto(String make)
    {
        carType = make;
    }
    public String getCarType()
    {
        return carType;
    }
    public void setCarType(String s)
    {
        carType = s;
    }
    public double getPrice()
    {
        return price;
    }
    public abstract void setPrice();
    public abstract void print();
}
