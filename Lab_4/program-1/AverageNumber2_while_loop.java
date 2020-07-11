public class AverageNumber2 {

    public static void main(String[] args) {
        int n = 50;
        int i = 1;
        float sum = 0, average;
        while (i<=n){
            sum = sum+i;
            i++;
        }
        average = (sum/n);
        System.out.println("average of number is "+ average);

    }

}
