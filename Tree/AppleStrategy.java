package Tree;

/**
 * Class AppleStrategy
 * Mengimplementasikan class AppleStrategy
 * Berisi tree Apple
 */
public class AppleStrategy implements TreeStrategy {
    /**
     * Menset nama tree
     */
    private String name = "Apple";

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
