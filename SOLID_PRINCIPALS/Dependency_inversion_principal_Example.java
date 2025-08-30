package SOLID_PRINCIPALS;

interface Device 
{
    void turnOn();
}

class LightBulb implements Device 
{
    public void turnOn() 
    {
        System.out.println("Light bulb turned on");
    }
}

class Switch 
{
    private Device device;

    public Switch(Device device) 
    {
        this.device = device;
    }

    void operate() 
    {
        device.turnOn();
    }
}

public class Dependency_inversion_principal_Example {

	public static void main(String[] args) 
	{
		Device bulb = new LightBulb();
        Switch lightSwitch = new Switch(bulb);
        lightSwitch.operate();

	}

}
