import java.util.Objects;

public class Notebook {
    
    private int ram; // ОЗУ в ГБ
    private int hdd; // Объем ЖД в ГБ
    private String os; // Операционная система
    private double display; // Диагональ дисплея

    public Notebook(int ram, int hdd, String os, double display) {
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.display = display;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }
    public String getOs() {
        return os;
    }
    public double getDisplay() {
        return display;
    }

    @Override
    public String toString() {
        return "Notebook {" + "RAM=" + ram + " GB, HDD=" + hdd + " GB, OS='" + os + '\'' + ", Diagonal='" + display + '\'' + '}';//????
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
            Notebook notebook = (Notebook) o;
            return ram == notebook.ram && hdd == notebook.hdd &&
            os.equals(notebook.os) && display == notebook.display;//color.equals(laptop.color);   ?????
    }

    @Override
    public int hashCode() {
        return Objects.hash(ram, hdd, os, display);
    }
}
    

