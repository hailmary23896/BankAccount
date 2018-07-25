
class Current extends Account
{
    Current()
    {}
    
    Current(int a,double b,String type)
    {
        ac_no=a;
        balance=b;
        ac_type=type;
    }
    
    void credit()
    {
        super.credit();
        balance=balance-5;
    }
    
    void debit()
    {
        super.debit();
        balance=balance-5;
    }
    
}
