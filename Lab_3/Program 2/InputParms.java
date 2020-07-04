public class InputParms {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String name[] = new String[3];
        name[0] = "Mahfuz";
        name[1] = "WuHongTu";
        name[2] = "PuYingMing";

        System.out.print("I am ");
        String Name = scanner.next();

        for (int i = 0; i < 3; i++) {
            if (Name.equals(name[i])) {
                System.out.println("The name " + Name + " was found.");
            }
        }
    }
