/**
 * Created by user on 14/09/2015.
 */
public class car
{
    private String name;
    private String manufacturer;
    private driver Driver;
    private int fuelCapacity;
    public car(String name,String manufacturer,driver Driver,int fuelCapacity)
    {

        this.name=name;
        this.Driver=Driver;
        this.manufacturer=manufacturer;
        this.fuelCapacity=fuelCapacity;

    }
    public car(String name,String manufacturer)
    {
        this.name=name;
        this.manufacturer=manufacturer;
    }
    public void setFuelCapacity(int fuelCapacity)
    {
        this.fuelCapacity=fuelCapacity;
    }
    public int getFuelCapacity()
    {
        return fuelCapacity;
    }
    public void setDriver(driver Driver)
    {
        this.Driver= Driver;
    }
    public driver getDriver()
    {
        return Driver;
    }
    public String getName()
    {
        return name;
    }
    public String getManufacturer()
    {
        return manufacturer;
    }
    public void refuel(int miles)
    {
        fuelCapacity+=miles;
    }
    public void drive(int miles)
    {
        if(fuelCapacity>=miles)
            fuelCapacity-=miles;
        else
            System.out.println("Driving distance exceeds the car's fuelcapacity! ");
    }

}
