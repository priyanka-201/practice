import java.util.Scanner;

public class Switchdemo {
    public static void main(String[] args) {
      /*  Scanner sc=new Scanner(System.in);
        System.out.println("Enter color");
        String color= sc.next();
        switch (color){
            case "red":
                System.out.println("Stop");
                break;
            case "green":
                System.out.println("go");
                break;
            case "yellow":
                System.out.println("Get ready");
                break;
            default:
                System.out.println("enter correct color");

        }*/
    Scanner ch=new Scanner(System.in);
        System.out.println("Enter Status code");
        int code= ch.nextInt();
        switch (code){
            case 404:
                System.out.println("Not found");
                break;
            case 500:
                    System.out.println("internal server error");
                    break;
            case 200:
                System.out.println("success");
                break;
            default:
                System.out.println("enter correct code");
        }
    }

}
