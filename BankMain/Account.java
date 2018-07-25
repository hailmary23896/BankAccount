import java.util.*;
class Account
{
    int ac_no;
    double balance;
    String ac_type;
    Scanner in =new Scanner(System.in);
    
    Account()
    {
    }
    
    Account(int a,double b,String type)
    {
        ac_no=a;
        balance=b;
        ac_type=type;
    }
    
    void debit()
    {
        double d;
        System.out.print("Amount to debit : ");
        d=in.nextDouble();
        if(balance-d >0)
        {
            balance= balance-d;
        }
        else
            System.out.println("Insufficient balance ");
            
    }
    
    void credit()
    {
        double c;
        System.out.print("Amount to credit : ");
        c=in.nextDouble();
        balance=balance+c;
    }
    
    void display()
    {
        System.out.println("Account number : "+ac_no);
        System.out.println("Balance : "+balance);
        System.out.println("Account type : "+ac_type);
    }
        
            
    
   
    
}
