import java.util.Scanner;

//string and int inputs
public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.print("Enter some input :");
        // int roll_no = input.nextInt();
        // System.out.println("Your roll number is : " +roll_no);
        
        //underscore(_) ignored with comma (,)
        // int a = 234_000_000
        System.out.println("Enter Your name :");
        String name = input.next();
        System.out.println("Your Name is :  "+name);

        float marks = input.nextFloat();
        System.out.println(marks);


    }
}
