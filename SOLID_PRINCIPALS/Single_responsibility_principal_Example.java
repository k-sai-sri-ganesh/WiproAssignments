package SOLID_PRINCIPALS;

class PaymentProcessor
{
    void processPayment() 
    {
        System.out.println("Processing payment...");
    }
}

class Notification
{
    void sendReceipt() 
    {
        System.out.println("Sending receipt to customer...");
    }
}

public class Single_responsibility_principal_Example {

	public static void main(String[] args) 
	{
		PaymentProcessor processor = new PaymentProcessor();
        Notification notifier = new Notification();
        
        processor.processPayment();
        notifier.sendReceipt();

	}

}
