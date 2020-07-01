public class Payroll {

    public static void main(String[] args) {
        // write your code here

        double pay=25;
        double HouseWorked=40;
        double Grosspay=pay*HouseWorked;
        double withholdingTax=Grosspay*0.15;
        double netpay=Grosspay-withholdingTax;
        System.out.println("Gross pay: "+"$"+Grosspay);
        System.out.println("Withholding tax: "+"$"+withholdingTax);
        System.out.println("Net pay: "+"$"+netpay);

    }
}
