interface ATM
{
    void withdraw(Bank b);
    void deposit(Bank b);
    void checkBalance(Bank b);
    void changePin(Bank b);
    void details(Bank b);
}