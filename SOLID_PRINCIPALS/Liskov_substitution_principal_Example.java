package SOLID_PRINCIPALS;

interface car 
{
    void Race();
}

class ThorRoxy implements car
{
    public void Race() 
    {
        System.out.println("ThorRoxy is in race");
    }
}

class Dodge implements car 
{
    public void Race()
    {
        System.out.println("Dodge is in race");
    }
}

public class Liskov_substitution_principal_Example 
{
    public static void main(String[] args)
    {
        car bird1 = new ThorRoxy();
        car bird2 = new Dodge();

        bird1.Race();
        bird2.Race(); 
    }
}