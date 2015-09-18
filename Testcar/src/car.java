
public class car
{
    private String name;
    private String manufacturer;
    private driver driver;
    private int fuelCapacity;
    public car(String name, String manufacturer, driver driver, int fuelCapacity)
    {
        this.name = name;
        this.driver = driver;
        this.manufacturer = manufacturer;
        this.fuelCapacity = fuelCapacity;
    }
    public car(String name, String manufacturer)
    {
        this.name = name;
        this.manufacturer = manufacturer;
    }
    public void setFuelCapacity(int miles)
    {
        fuelCapacity=miles;
    }
   public void setDriver(driver driver)
   {
       this.driver = driver;
   }

    public String getName()
    {
        return name;
    }
    public driver getDriver()
    {
        return driver;
    }
    public String getManufacturer()
    {
        return manufacturer;
    }
    public int getFuelCapacity()
    {
        return fuelCapacity;
    }
    public void drive(int miles)
    {
        if (fuelCapacity >= miles) {
            fuelCapacity -= miles;
        } else {
            System.out.println("Driving distance exceeds the car's fuel capacity!");
        }
    }
    public void refuel(int miles)
    {
        fuelCapacity += miles;
    }
    public void print()
    {
       System.out.println(name +" "+ "Manufacturer:" +" "+ manufacturer +" "+ "Driver:" +" "+ driver.getName()+" " + "FuelCapacity:" +" "+ fuelCapacity);
    }
}
