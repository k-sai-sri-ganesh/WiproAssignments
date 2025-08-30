package SOLID_PRINCIPALS;

interface Printer 
{
    void print();
}

interface Scanner 
{
    void scan();
}
class BasicPrinter implements Printer 
{
    public void print() 
    {
        System.out.println("Printing document...");
    }
}

public class Interface_segregation_principal_Example {

	public static void main(String[] args) 
	{
		Printer printer = new BasicPrinter();
        printer.print();
	}

}
