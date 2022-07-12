import java.util.Scanner ;

public class DebitProject {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userName, password;
        int rights = 3, select, balance = 5000, depositMoney, withdrawalMoney;


        while (rights > 0) {

            System.out.print("Enter your user name : ");
            userName = input.nextLine();

            System.out.print("Enter your password : ");
            password = input.nextLine();

            if (userName.equals("basakk.s") && password.equals("zirto123")) {
                System.out.println("Welcome the Turkey Bank !");
                do {
                    System.out.println(" Please select the operation you want to do : ");
                    System.out.println("1-Money Deposit\n" +
                            "2-Money Withdrawal\n" +
                            "3-Balance Inquiry\n" +
                            "4-Exit");
                    select = input.nextInt();

                switch (select){
                    case 1:
                        System.out.println("Enter the amount you want to deposit : ");
                        depositMoney = input.nextInt();
                        balance += depositMoney;
                        System.out.print("Your new balance is : " + balance);
                        break;

                    case 2:
                        System.out.print("Enter the amount you want to withdrawal : ");
                        withdrawalMoney = input.nextInt();
                        if (withdrawalMoney > balance) {
                            System.out.println("The balance is insufficient");
                        } else {
                            balance -= withdrawalMoney;
                        }
                        System.out.print("Your new balance is : " + balance);
                        break;

                    case 3:
                        System.out.print("Your balance is : " + balance);
                        break;
                }

                }while(select != 4);
                System.out.println("See you again !");
                break;

            }
            else {
                rights-- ;
                if (rights > 0){
                    System.out.println("Your Remaining Rights : " + rights);
                    System.out.println("Incorrect username or password. Try again.");
                } else {
                    System.out.print("Your account has been blocked, please contact the bank.");
                }
            }
        }
    }
}



