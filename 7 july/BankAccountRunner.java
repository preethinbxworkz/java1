class BankAccountRunner{
public static void main(String args[])
{
BankAccount.credit(2000.00);
BankAccount.credit(2000);

BankAccount.debit(2000);
BankAccount.debit(2000);
BankAccount.credit(2000);

double output= BankAccount.getBalance();
System.out.println(output);
}
}