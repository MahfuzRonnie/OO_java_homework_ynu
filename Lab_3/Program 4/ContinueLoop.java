public class ContinueLoop {
    public static void main(String[] args) {
        // write your code here
        for (int count = 1; count <= 10; count++){
            if(count==5)
                continue;
            System.out.println("count = " + count);
        }
        System.out.println("Used continue statement to skip printing 5");
    }
}
