class BankAccount{
static double balance;
public static void credit(double amount){
balance=balance+amount;
return;
}
public static void debit(double amount){
balance=balance-amount;
return;
}
public static double getBalance(){
return balance;

 }
}