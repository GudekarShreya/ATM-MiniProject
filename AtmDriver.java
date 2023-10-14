import java.util.*;
class AtmDriver
{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        Bank c1=new Bank("Gaurav More", 101, 500, 1234);
        ATM a= new AtmChild();
        boolean b=true;
        while(b)
        {
            System.out.println("Enter 1 for withdraw\nEnter 2 for deposit\nEnter 3 for check balance\nEnter 4 for change pin\nEnter 5 for customer details");
            int option=scan.nextInt();

            switch(option)
            {
                case 1:
                    a.withdraw(c1);
                    break;
                case 2:
                    a.deposit(c1);
                    break;
                case 3:
                    a.checkBalance(c1);
                    break;
                case 4:
                    a.changePin(c1);
                    break;
                case 5:
                    a.details(c1);
                    break;
                default:
                    System.out.println("Choose correct option");
            }

            System.out.println("Do you want to continue the operation then press 1\nPress any key to exit");
            int v= scan.nextInt();
            if(v!=1)
            {
                b=false;
            }
        }
    }
}