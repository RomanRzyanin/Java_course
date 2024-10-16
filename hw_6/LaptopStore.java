import java.util.*;

public class LaptopStore {
    public static void main(String[] args) {
        Set<Notebook> notebooks = new HashSet<>();
            notebooks.add(new Notebook(8, 512, "Windows 10", 17.6));
            notebooks.add(new Notebook(16, 1024, "Windows 11", 15));
            notebooks.add(new Notebook(8, 256, "Ubuntu", 14));
            notebooks.add(new Notebook(32, 1024, "macOS", 18.4));
            notebooks.add(new Notebook(16, 512, "Windows 10", 17.6));
        Map<Integer, String> criteria = new HashMap<>();
            criteria.put(1, "ОЗУ");
            criteria.put(2, "Объем ЖД");
            criteria.put(3, "Операционная система");
            criteria.put(4, "Диагональ дисплея");       
        Scanner scanner = new Scanner(System.in);
        Map<String, Object> filters = new HashMap<>();
        boolean continueFiltering = true;
        while (continueFiltering) { 
            System.out.println("Выберите характеристики ноутбука.");
            System.out.println("Введите цифру, соответствующую необходимому критерию:");
            System.out.println("-----------------------------------------------------");
            for (Map.Entry<Integer, String> entry : criteria.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        System.out.print("-->");
        int criterion = scanner.nextInt();
        scanner.nextLine(); 
        switch (criterion) {
        case 1:
            System.out.print("Введите минимальное значение ОЗУ (в ГБ): ");
            filters.put("ram", scanner.nextInt());
            scanner.nextLine(); 
            break;
        case 2:
            System.out.print("Введите минимальное значение объема HHD (в ГБ): ");
            filters.put("hdd", scanner.nextInt());
            scanner.nextLine(); 
            break;
        case 3:
            System.out.print("Введите операционную систему: ");
            filters.put("os", scanner.nextLine());
            break;
        case 4:
            System.out.print("Введите минимальную диагональ дисплея: ");
            filters.put("display", scanner.nextDouble());
            scanner.nextLine();
            break;
        default:
            System.out.println("Некорректный критерий.");
        }
        System.out.print("Хотите добавить еще один критерий? (Если да, нажмите 1, нет - 2): ");
        String response = scanner.nextLine();
        continueFiltering = response.equalsIgnoreCase("1"); 
        }
        filterNotebooks(notebooks, filters);
       
    }



    public static void filterNotebooks(Set<Notebook> notebooks, Map<String, Object> filters) {
        for (Notebook notebook : notebooks) {
            boolean key = true;
            if (filters.containsKey("ram") && notebook.getRam() < (int) filters.get("ram")) {
                key = false;
            }
            if (filters.containsKey("hdd") && notebook.getHdd() < (int) filters.get("hdd")) {
                key = false;
            }
            if (filters.containsKey("os") && !notebook.getOs().equalsIgnoreCase((String) filters.get("os"))) {
                key = false;
            }
            if (filters.containsKey("display") && notebook.getDisplay() < (double) filters.get("display")){
                key = false; 
            }
            if (key) {
                System.out.println(notebook);
            }
        }
    } 
}
    