import java.util.*;

public class ConstructorExample {

    String sumit; // declaration
    String ashwin;

    ConstructorExample(String sumit, String harsh) { // Initialize the variable
        this.sumit = sumit;
        this.ashwin = harsh;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Sumit value");
        String sumit = sc.nextLine();

        System.out.println("Enter Ashwin value");
        String ashwin = sc.nextLine();

        ConstructorExample obj = new ConstructorExample(sumit, ashwin);

        System.out.println();
        System.out.println("Constructor ch output:-");
        System.out.println(obj.sumit);
        System.out.println(obj.ashwin);
    }
}
