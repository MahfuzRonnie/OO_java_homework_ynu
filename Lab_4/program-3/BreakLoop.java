public class BreakLoop {
    public static void main(String[] args) {
        // write your code here
        for (int count = 1; count <= 10; count++){
            if(count==5)
                break;
            System.out.println("count = " + count);
        }
        System.out.println("Broke out of the loop at count = 5");
    }
}
