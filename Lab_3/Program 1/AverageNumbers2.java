public class AverageNumber2 {

    public static void main(String[] args) {
        // write your code here
        int n = 50;
        float sum = 0, average;
        for (int i = 1; i<=n;i++){
            sum = sum+i;
       }
        average = (sum/n);
        System.out.println("average of number is "+ average);

    }

}
