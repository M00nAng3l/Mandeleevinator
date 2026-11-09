import java.util.ArrayList;

public class ElementDataBase
{
    //Arraylist
    private ArrayList<elements>periodicTable;

    //creating the constructor method
    public ElementDataBase()
    {
      periodicTable = new ArrayList<>();

      //elements
        periodicTable.add(new elements(
                "hydrogen", "H", 1, 1.008,"nonmetal", "gas"
        ));
        periodicTable.add(new elements("Helium","He", 2, 4.003,"Nobel Gas","Gas"

        ));
        periodicTable.add(new elements("Lithium","Li",3,6.94,"Alkali Metal","Solid"));

        periodicTable.add(new elements("Beryllium","Be",4,9.012,"Alkaline Earth Metal","Solid"));

        periodicTable.add(new elements(
                "Boron", "B", 5, 10.81, "Metalloid", "Solid"
        ));

        periodicTable.add(new elements("Carbon", "C", 6, 12.011, "Nonmetal", "Solid" ));

        periodicTable.add(new elements(
                "Nitrogen", "N", 7, 14.007, "Nonmetal", "Gas"));

        periodicTable.add(new elements(
                "Oxygen", "O", 8, 15.999, "Nonmetal", "Gas" ));

        //Ai code below - Ai was used so I wouldn't have to write every single remaining 110 elements------------------------------
        periodicTable.add(new elements("Fluorine", "F", 9, 18.998, "Halogen", "Gas"));
        periodicTable.add(new elements("Neon", "Ne", 10, 20.180, "Noble Gas", "Gas"));
        periodicTable.add(new elements("Sodium", "Na", 11, 22.990, "Alkali Metal", "Solid"));
        periodicTable.add(new elements("Magnesium", "Mg", 12, 24.305, "Alkaline Earth Metal", "Solid"));
        periodicTable.add(new elements("Aluminum", "Al", 13, 26.982, "Post-Transition Metal", "Solid"));
        periodicTable.add(new elements("Silicon", "Si", 14, 28.085, "Metalloid", "Solid"));
        periodicTable.add(new elements("Phosphorus", "P", 15, 30.974, "Nonmetal", "Solid"));
        periodicTable.add(new elements("Sulfur", "S", 16, 32.06, "Nonmetal", "Solid"));
        periodicTable.add(new elements("Chlorine", "Cl", 17, 35.45, "Halogen", "Gas"));
        periodicTable.add(new elements("Argon", "Ar", 18, 39.948, "Noble Gas", "Gas"));
        periodicTable.add(new elements("Potassium", "K", 19, 39.098, "Alkali Metal", "Solid"));
        periodicTable.add(new elements("Calcium", "Ca", 20, 40.078, "Alkaline Earth Metal", "Solid"));
        periodicTable.add(new elements("Scandium", "Sc", 21, 44.956, "Transition Metal", "Solid"));
        periodicTable.add(new elements("Titanium", "Ti", 22, 47.867, "Transition Metal", "Solid"));
        periodicTable.add(new elements("Vanadium", "V", 23, 50.942, "Transition Metal", "Solid"));
        periodicTable.add(new elements("Chromium", "Cr", 24, 51.996, "Transition Metal", "Solid"));
        periodicTable.add(new elements("Manganese", "Mn", 25, 54.938, "Transition Metal", "Solid"));
        periodicTable.add(new elements("Iron", "Fe", 26, 55.845, "Transition Metal", "Solid"));
        periodicTable.add(new elements("Cobalt", "Co", 27, 58.933, "Transition Metal", "Solid"));
        periodicTable.add(new elements("Nickel", "Ni", 28, 58.693, "Transition Metal", "Solid"));
        periodicTable.add(new elements("Copper", "Cu", 29, 63.546, "Transition Metal", "Solid"));
        periodicTable.add(new elements("Zinc", "Zn", 30, 65.38, "Transition Metal", "Solid"));
        periodicTable.add(new elements("Gallium", "Ga", 31, 69.723, "Post-Transition Metal", "Solid"));
        periodicTable.add(new elements("Germanium", "Ge", 32, 72.630, "Metalloid", "Solid"));
        periodicTable.add(new elements("Arsenic", "As", 33, 74.922, "Metalloid", "Solid"));
        periodicTable.add(new elements("Selenium", "Se", 34, 78.971, "Nonmetal", "Solid"));
        periodicTable.add(new elements("Bromine", "Br", 35, 79.904, "Halogen", "Liquid"));
        periodicTable.add(new elements("Krypton", "Kr", 36, 83.798, "Noble Gas", "Gas"));

        periodicTable.add(new elements("Rubidium", "Rb", 37, 85.468, "Alkali Metal", "Solid"));
        periodicTable.add(new elements("Strontium", "Sr", 38, 87.62, "Alkaline Earth Metal", "Solid"));
        periodicTable.add(new elements("Yttrium", "Y", 39, 88.906, "Transition Metal", "Solid"));
        periodicTable.add(new elements("Zirconium", "Zr", 40, 91.224, "Transition Metal", "Solid"));
        periodicTable.add(new elements("Niobium", "Nb", 41, 92.906, "Transition Metal", "Solid"));
        periodicTable.add(new elements("Molybdenum", "Mo", 42, 95.95, "Transition Metal", "Solid"));
        periodicTable.add(new elements("Technetium", "Tc", 43, 98, "Transition Metal", "Solid"));
        periodicTable.add(new elements("Ruthenium", "Ru", 44, 101.07, "Transition Metal", "Solid"));
        periodicTable.add(new elements("Rhodium", "Rh", 45, 102.906, "Transition Metal", "Solid"));
        periodicTable.add(new elements("Palladium", "Pd", 46, 106.42, "Transition Metal", "Solid"));
        periodicTable.add(new elements("Silver", "Ag", 47, 107.868, "Transition Metal", "Solid"));
        periodicTable.add(new elements("Cadmium", "Cd", 48, 112.414, "Transition Metal", "Solid"));
        periodicTable.add(new elements("Indium", "In", 49, 114.818, "Post-Transition Metal", "Solid"));
        periodicTable.add(new elements("Tin", "Sn", 50, 118.710, "Post-Transition Metal", "Solid"));
        periodicTable.add(new elements("Antimony", "Sb", 51, 121.760, "Metalloid", "Solid"));
        periodicTable.add(new elements("Tellurium", "Te", 52, 127.60, "Metalloid", "Solid"));
        periodicTable.add(new elements("Iodine", "I", 53, 126.904, "Halogen", "Solid"));
        periodicTable.add(new elements("Xenon", "Xe", 54, 131.293, "Noble Gas", "Gas"));

        periodicTable.add(new elements("Cesium", "Cs", 55, 132.905, "Alkali Metal", "Solid"));
        periodicTable.add(new elements("Barium", "Ba", 56, 137.327, "Alkaline Earth Metal", "Solid"));
        periodicTable.add(new elements("Lanthanum", "La", 57, 138.905, "Lanthanide", "Solid"));
        periodicTable.add(new elements("Cerium", "Ce", 58, 140.116, "Lanthanide", "Solid"));
        periodicTable.add(new elements("Praseodymium", "Pr", 59, 140.908, "Lanthanide", "Solid"));
        periodicTable.add(new elements("Neodymium", "Nd", 60, 144.242, "Lanthanide", "Solid"));
        periodicTable.add(new elements("Promethium", "Pm", 61, 145, "Lanthanide", "Solid"));
        periodicTable.add(new elements("Samarium", "Sm", 62, 150.36, "Lanthanide", "Solid"));
        periodicTable.add(new elements("Europium", "Eu", 63, 151.964, "Lanthanide", "Solid"));
        periodicTable.add(new elements("Gadolinium", "Gd", 64, 157.25, "Lanthanide", "Solid"));
        periodicTable.add(new elements("Terbium", "Tb", 65, 158.925, "Lanthanide", "Solid"));
        periodicTable.add(new elements("Dysprosium", "Dy", 66, 162.500, "Lanthanide", "Solid"));
        periodicTable.add(new elements("Holmium", "Ho", 67, 164.930, "Lanthanide", "Solid"));
        periodicTable.add(new elements("Erbium", "Er", 68, 167.259, "Lanthanide", "Solid"));
        periodicTable.add(new elements("Thulium", "Tm", 69, 168.934, "Lanthanide", "Solid"));
        periodicTable.add(new elements("Ytterbium", "Yb", 70, 173.045, "Lanthanide", "Solid"));
        periodicTable.add(new elements("Lutetium", "Lu", 71, 174.967, "Lanthanide", "Solid"));
        periodicTable.add(new elements("Hafnium", "Hf", 72, 178.49, "Transition Metal", "Solid"));
        periodicTable.add(new elements("Tantalum", "Ta", 73, 180.948, "Transition Metal", "Solid"));
        periodicTable.add(new elements("Tungsten", "W", 74, 183.84, "Transition Metal", "Solid"));
        periodicTable.add(new elements("Rhenium", "Re", 75, 186.207, "Transition Metal", "Solid"));
        periodicTable.add(new elements("Osmium", "Os", 76, 190.23, "Transition Metal", "Solid"));
        periodicTable.add(new elements("Iridium", "Ir", 77, 192.217, "Transition Metal", "Solid"));
        periodicTable.add(new elements("Platinum", "Pt", 78, 195.084, "Transition Metal", "Solid"));
        periodicTable.add(new elements("Gold", "Au", 79, 196.967, "Transition Metal", "Solid"));
        periodicTable.add(new elements("Mercury", "Hg", 80, 200.592, "Transition Metal", "Liquid"));
        periodicTable.add(new elements("Thallium", "Tl", 81, 204.38, "Post-Transition Metal", "Solid"));
        periodicTable.add(new elements("Lead", "Pb", 82, 207.2, "Post-Transition Metal", "Solid"));
        periodicTable.add(new elements("Bismuth", "Bi", 83, 208.980, "Post-Transition Metal", "Solid"));
        periodicTable.add(new elements("Polonium", "Po", 84, 209, "Post-Transition Metal", "Solid"));
        periodicTable.add(new elements("Astatine", "At", 85, 210, "Halogen", "Solid"));
        periodicTable.add(new elements("Radon", "Rn", 86, 222, "Noble Gas", "Gas"));

        periodicTable.add(new elements("Francium", "Fr", 87, 223, "Alkali Metal", "Solid"));
        periodicTable.add(new elements("Radium", "Ra", 88, 226, "Alkaline Earth Metal", "Solid"));
        periodicTable.add(new elements("Actinium", "Ac", 89, 227, "Actinide", "Solid"));
        periodicTable.add(new elements("Thorium", "Th", 90, 232.038, "Actinide", "Solid"));
        periodicTable.add(new elements("Protactinium", "Pa", 91, 231.036, "Actinide", "Solid"));
        periodicTable.add(new elements("Uranium", "U", 92, 238.029, "Actinide", "Solid"));
        periodicTable.add(new elements("Neptunium", "Np", 93, 237, "Actinide", "Solid"));
        periodicTable.add(new elements("Plutonium", "Pu", 94, 244, "Actinide", "Solid"));
        periodicTable.add(new elements("Americium", "Am", 95, 243, "Actinide", "Solid"));
        periodicTable.add(new elements("Curium", "Cm", 96, 247, "Actinide", "Solid"));
        periodicTable.add(new elements("Berkelium", "Bk", 97, 247, "Actinide", "Solid"));
        periodicTable.add(new elements("Californium", "Cf", 98, 251, "Actinide", "Solid"));
        periodicTable.add(new elements("Einsteinium", "Es", 99, 252, "Actinide", "Solid"));
        periodicTable.add(new elements("Fermium", "Fm", 100, 257, "Actinide", "Solid"));
        periodicTable.add(new elements("Mendelevium", "Md", 101, 258, "Actinide", "Solid"));
        periodicTable.add(new elements("Nobelium", "No", 102, 259, "Actinide", "Solid"));
        periodicTable.add(new elements("Lawrencium", "Lr", 103, 266, "Actinide", "Solid"));
        periodicTable.add(new elements("Rutherfordium", "Rf", 104, 267, "Transition Metal", "Unknown"));
        periodicTable.add(new elements("Dubnium", "Db", 105, 268, "Transition Metal", "Unknown"));
        periodicTable.add(new elements("Seaborgium", "Sg", 106, 269, "Transition Metal", "Unknown"));
        periodicTable.add(new elements("Bohrium", "Bh", 107, 270, "Transition Metal", "Unknown"));
        periodicTable.add(new elements("Hassium", "Hs", 108, 277, "Transition Metal", "Unknown"));
        periodicTable.add(new elements("Meitnerium", "Mt", 109, 278, "Transition Metal", "Unknown"));
        periodicTable.add(new elements("Darmstadtium", "Ds", 110, 281, "Transition Metal", "Unknown"));
        periodicTable.add(new elements("Roentgenium", "Rg", 111, 282, "Transition Metal", "Unknown"));
        periodicTable.add(new elements("Copernicium", "Cn", 112, 285, "Transition Metal", "Unknown"));
        periodicTable.add(new elements("Nihonium", "Nh", 113, 286, "Post-Transition Metal", "Unknown"));
        periodicTable.add(new elements("Flerovium", "Fl", 114, 289, "Post-Transition Metal", "Unknown"));
        periodicTable.add(new elements("Moscovium", "Mc", 115, 290, "Post-Transition Metal", "Unknown"));
        periodicTable.add(new elements("Livermorium", "Lv", 116, 293, "Post-Transition Metal", "Unknown"));
        periodicTable.add(new elements("Tennessine", "Ts", 117, 294, "Halogen", "Unknown"));
        periodicTable.add(new elements("Oganesson", "Og", 118, 294, "Noble Gas", "Unknown"));
        //End of Ai code----------------------------------------

    }

  // Getter
  public ArrayList<elements> getElementDataBase()
  {
    return periodicTable;
  }
}





