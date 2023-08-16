import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
    Scanner emp=new Scanner(System.in);
    System.out.println("Enter Employee details");
    System.out.println("Enter Employee First Name");
    String firstName= emp.next();
    System.out.println("Enter Employee Last name");
    String lastName= emp.next();
    System.out.println("Enter Employee ID");
    int id= emp.nextInt();
    System.out.println("Enter Employee Experience in decimal format");
    double experience= emp.nextDouble();
    System.out.println("Enter Employee quarterly goal in one line");
    emp.next();
    String goal= emp.nextLine();
    System.out.println("Enter if he/she qualifies for bonus 'y' or 'n'");
    char bonus=emp.next().charAt(0);
    System.out.println("Employee Fullname : "+firstName+" "+lastName);
    System.out.println("Employee ID : " +id+ " Experience : "+experience);
    System.out.println("Goal :" +goal);
    System.out.println("Is he/she eligible for bonus :" +bonus);

}
}

