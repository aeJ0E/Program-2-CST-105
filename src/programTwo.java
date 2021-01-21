import java.util.*;

public class programTwo {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your First Name?");
        String fName = scan.nextLine();
        System.out.println("What is your Last Name?");
        String lName = scan.nextLine();
        scan.close();
        System.out.println("Hello, " + fName + " " + lName);
    }
}
