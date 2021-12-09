package Tree;

/**
 * Class MangoStrategy
 * Mengimplementasikan class TreeStrategy
 * Berisi tree Mango
 */
public class MangoStrategy implements TreeStrategy{
    /**
     * Menset nama tree
     */
    private String name = "Mango";

    @Override
    public void watch(boolean start) {
        if(start) {
            System.out.println(">>>Mengambil tree "+ this.name +"<<<");
        } else {
            System.out.println("<<<Tree "+ this.name +" selesai>>>");
        }
    }

    @Override
    public String getName() {
        // Mengembalikan atribut name
        return this.name;
    }
}
