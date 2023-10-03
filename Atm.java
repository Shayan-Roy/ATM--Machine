import java.util.Scanner;

class atm{
    int pin=4559;
    float balance=10000;

    public void checkpin() {
        System.out.println("enter your pin");
        Scanner sc = new Scanner(System.in);
        int checkpin;
        checkpin =sc.nextInt();
        if (checkpin == pin) {
            menu();
        }
        else {
            System.out.println("enter a valid pin");
            menu();
        }
    }

    public void menu() {
        System.out.println("1.check balance");
        System.out.println("2.Money deposit");
        System.out.println("3.Money withdawl");
        System.out.println("4.Exit");
        System.out.println("Enter your choice");
        Scanner sc = new Scanner(System.in);
        int choice;
        choice = sc.nextInt();
        if (choice ==1) {
            System.out.print("Your Balance is:");
            System.out.println(balance);
            menu();
        }
        else if (choice ==2)
        {
            moneydeposit();
            menu();
        }
        else if (choice ==3) {
            moneywithdrawl();
            menu();
        }
        else if (choice == 4) {
            return;
        }
    }

    public void moneydeposit() {
        System.out.println("Enter your amount");
        Scanner sc = new Scanner(System.in);
        float newBal;
        newBal= sc.nextInt();
        balance=balance+newBal;
        System.out.print("Current Balance is:");
        System.out.println(balance);
    }

    public void moneywithdrawl() {
        System.out.println("Enter your amount");
        Scanner sc = new Scanner(System.in);
        float newBal;
        newBal= sc.nextInt();
        if (newBal > balance){
            System.out.println("Insufficient Balance")
            menu();
        }
        balance=balance-newBal;
        System.out.print("Current Balance is:");
        System.out.println(balance);
    }


}
public class Atm {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        atm obj = new atm();
        obj.checkpin();

    }

}


