import java.util.*;
class AtmChild implements ATM
{
    Scanner scan = new Scanner(System.in);

    public void withdraw( Bank b)
    {
        boolean condition = true;
        while(condition)
        {
            System.out.println("Enter the pin : ");
            int pin = scan.nextInt();
            if(b.getPin()==pin)
            {
                System.out.println("Enter amount to be withdraw");
                int amount = scan.nextInt();
                if(b.getBalance() >= amount)
                {
                    b.setBalance(b.getBalance()-amount);
                    System.out.println("Your transaction of rs."+amount+" withdraw successfully!!");
                    System.out.println("-----------------------------------------------------------------------");
                    condition = false;
                }
                else
                {
                    System.out.println("Insufficient funds!!");
                }
            }
            else
            {
                System.out.println("Entered wrong pin!!");
            }
        }
    }

    public void deposit(Bank b)
    {
        boolean condition= true;
        while(condition)
        {
            System.out.println("Enter the pin");
            int pin = scan.nextInt();
            if(b.getPin()==pin)
            {
                System.out.println("Enter the amount to be deposit");
                int amount=scan.nextInt();
                b.setBalance(b.getBalance()+amount);
                System.out.println("Your transaction is successful..\nRs."+amount+" creadited to your account number :"+b.acNo);
                System.out.println("Your current account balance is rs."+b.getBalance());
                System.out.println("-----------------------------------------------------------------------");
                condition= false;
            }
            else
            {
                System.out.println("Entered wrong pin");
            }
        }
    }

    public void checkBalance(Bank b)
    {
        boolean condition = true;
        while(condition)
        {
            System.out.println("Enter the pin");
            int pin = scan.nextInt();
            if(b.getPin()==pin)
            {
                System.out.println("Your account balance is "+b.getBalance());
                System.out.println("-----------------------------------------------------------------------");
                condition = false;
            }
            else
            {
                System.out.println("Entered wrong pin");
            }
        }
    }

    public void changePin(Bank b)
    {
        boolean condition=true;
        while(condition)
        {
            System.out.println("Enter the pin");
            int pin = scan.nextInt();
            if(b.getPin()==pin)
            {
                System.out.println("Enter your old pin");
                int oldPin = scan.nextInt();
                if(b.getPin()==oldPin)
                {
                    boolean c2= true;
                    while(c2)
                    {
                        System.out.println("Enter new pin");
                        int newPin= scan.nextInt();
                        System.out.println("Re-enter the new pin");
                        int newPin1 = scan.nextInt();
                        if(newPin==newPin1)
                        {
                            b.setPin(newPin);
                            c2=false;
                            condition=false;
                            System.out.println("Pin successfully change!!");
                            System.out.println("-----------------------------------------------------------------------");
                        }
                        else
                        {
                            System.out.println("New pins are not matching...");
                        }
                    }
                }
                else
                {
                    System.out.println("Old pin not matching..");
                }
            }
            else
            {
                System.out.println("Entered wrong pin!!!");
            }
        }
    }

    public void details(Bank b)
    {
        boolean condition=true;
        while(condition)
        {
            System.out.println("Enter the pin");
            int pin = scan.nextInt();
            if(b.getPin()==pin)
            {
                b.getDetails();
                System.out.println("-----------------------------------------------------------------------");
                condition=false;
            }
            else
            {
                System.out.println("Entered wrong pin!!");
            }
        }
    }


}