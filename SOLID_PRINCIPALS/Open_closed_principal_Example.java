package SOLID_PRINCIPALS;

interface PaymentMethod 
{
    void pay();
}

class creditCard implements PaymentMethod 
{
    public void pay() 
    {
        System.out.println("process CreditCard Payment");
    }
}

class debitCard implements PaymentMethod 
{
    public void pay() 
    {
        System.out.println("process debitCard Payment");
    }
}

class Processor 
{
    void Process(PaymentMethod paymentMethod) 
    {
        paymentMethod.pay();
    }
}

public class Open_closed_principal_Example {
    public static void main(String[] args) {
        Processor p = new Processor();
        p.Process(new creditCard());
        p.Process(new debitCard());
    }
}