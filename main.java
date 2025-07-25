import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char choice;
        double balance = 1000;
        double deposit;
        double withdraw;
        boolean isRunning = true;


//

        while (isRunning) {
            System.out.println("*****************");
            System.out.println("BANKING PROGRAM");
            System.out.println("*****************");

            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("*****************");
            System.out.println("enter your choice (1-4)");
            choice = scanner.next().charAt(0);

            if(choice == '1' ){
                System.out.println(balance);

            }
            else if(choice == '2'){
                System.out.println("how much would you like to deposit?");
                deposit = scanner.nextDouble();
                if(deposit < 0 ){
                    System.out.println("cannot deposit a negative number");
                    System.out.println(balance);
                }else{
                    balance = balance + deposit;
                    System.out.println("new balance of £" + balance);
                }
            }
            else if(choice == '3'){
                System.out.println("your balance is £" + balance);
                System.out.println("how much would you like to withdraw?");
                withdraw = scanner.nextDouble();
                balance -= withdraw;
                if(balance < 0){
                    System.out.println("you cannot withdraw that amount");
                    balance = balance + withdraw;
                    System.out.println(balance);
                }else if(withdraw < 0){
                    System.out.println("Please enter a positive number");
                    balance = balance + withdraw;
                    System.out.println(balance);
                }
                else{
                    System.out.println("your new balance is £" + balance);
                }
            }
            else if(choice == '4'){
                System.out.println("thank you for using the bank");
                isRunning = false;
            }else {
                System.out.println("incorrect imput");
            }
        }

    }
}


