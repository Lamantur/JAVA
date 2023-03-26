import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook("Machcreator-A Silver", 8, "Intel", 42990, "Machcreator",
                "-"));
        set.add(new Notebook("Stealth 17M A12UE-041RU Black", 16, "Intel", 125990, "MSI",
                "RTX3060"));
        set.add(new Notebook("IdeaPad 3 15ALC6", 4, "AMD", 37685, "Lenovo", "-"));
        set.add(new Notebook("15s-fq063ur", 8, "Intel", 40000, "HP", "-"));
        set.add(new Notebook("Extensa 15", 8, "Intel", 48990, "Acer", "-"));
        set.add(new Notebook("VICTUS", 8, "Intel", 66590, "HP", "GTX1650"));
        set.add(new Notebook("Vivobook", 4, "Intel", 27790, "ASUS", "-"));
        set.add(new Notebook("Rombica", 8, "Intel", 53490, "ASUS", "-"));
        set.add(new Notebook("RedmiBook", 16, "Intel", 71772, "Xiaomi", "-"));
        set.add(new Notebook("Pavilion", 8, "Intel", 57900, "HP", "-"));
        set.add(new Notebook("L15C", 8, "Intel", 64391, "MACHENIKE", "RTX3050"));
        set.add(new Notebook("MyBook Zenith", 8, "AMD", 42435, "ROMBICA", "-"));
        set.add(new Notebook("MateBook", 8, "Intel", 69990, "HUAWEI", "-"));
        set.add(new Notebook("Digma EVE", 16, "AMD", 37880, "Digma", "-"));
        set.add(new Notebook("Spirit 2", 8, "Intel", 39990, "Itel", "-"));
        set.add(new Notebook("Vostro", 4, "AMD", 26770, "DELL", "-"));
        set.add(new Notebook("Workbook", 8, "Intel", 40990, "HIPER", "-"));

        OperationWithNotebook operation = new OperationWithNotebook(set);
        operation.start();

    }
}