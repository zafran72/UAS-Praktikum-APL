package TreeAdapter;

/**
 * interface Fruit
 * Akan diimplementasika oleh class TreeAdapter.
 * Tujuannya adalah mengubah tree agar bisa 
 * dinikmati dalam bentuk fruit.
 */
interface Fruit {
    
    /**
     * method read bertugas membaca fruit yang
     * diadaptasi dari format tree.
     * @param Start jika bernilai true file fruit dibuka,
     * jika bernilai false file fruit ditutup/selesai.
     */
    public void read(Boolean Start);
}