
public class elements
{
    // Variables
    private String elementName;
    private String elementSymbol;
    private int atomicNumber;
    private double atomicMass;
    private String group;
    private String matter;

    // Constructor
    public elements(String elementName, String elementSymbol,
                    int atomicNumber, double atomicMass,
                    String group, String matter)
    {
        this.elementName = elementName;
        this.elementSymbol = elementSymbol;
        this.atomicNumber = atomicNumber;
        this.atomicMass = atomicMass;
        this.group = group;
        this.matter = matter;
    }

    // Getter methods
    public String getElementName()
    {
        return elementName;
    }

    public String getElementSymbol()
    {
        return elementSymbol;
    }

    public int getAtomicNumber()
    {
        return atomicNumber;
    }

    public double getAtomicMass()
    {
        return atomicMass;
    }

    public String getGroup()
    {
        return group;
    }

    public String getMatter()
    {
        return matter;
    }
}
