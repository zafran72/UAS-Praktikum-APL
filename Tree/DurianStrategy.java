package Tree;

/**
 * Class DurianStrategy
 * Mengimplementasikan class AnimeStrategy
 * Berisi tree Durian
 */
public class DurianStrategy implements TreeStrategy {
    /**
     * Menset nama tree
     */
    private String name = "Durian";

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
