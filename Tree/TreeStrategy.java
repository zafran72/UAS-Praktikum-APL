package Tree;

/**
 * Interface TreeStrategy
 * Memberikan opsi pilihan tree yang bisa ditonton
 * kepada para class yang ingin mengimplementasikannya.
 * fork input manual song tooth crazy sunset engine anger thing knife kick
 */
public interface TreeStrategy{
    /**
     * Method watch, berfungsi untuk memutar/menghentikan 
     * tree yang ingin ditonton.
     * @param start jika bernilai true, tree diambil
     * dan jika bernilai false, tree dihentikan.
     */
    public void watch(boolean start);

    /**
     * Method getName, mengembalikan nama tree dari class.
     * @return nama tree milik si class.
     */
    public String getName();
}
