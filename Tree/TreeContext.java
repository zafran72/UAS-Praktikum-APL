package Tree;

import TreeAdapter.TreeAdapter;

/**
 * Class TreeContext
 * Menset pilihan tree yang ingin ditonton.
 * Memutar tree yang ingin ditonton.
 * Memanggil class TreeAdapter, agar bisa menkonversi
 * tree ke dalam bentuk fruit.
 */
public class TreeContext {
    /**
     * Memanggil objek dari class lain
     * objek tree adalah pilihan tree yang ingin ditonton
     * objek fruit adalah tree yang sudah diconvert ke buah
     */
    TreeStrategy tree;
    TreeAdapter fruit;

    /**
     * method setTreeStrategy berfungsi menset pilihan tree.
     * Memanggil method setTreeAdapter, agar tree-nya juga
     * bisa dalam bentuk fruit.
     * @param tree pilihan tree yang ingin diset
     */
    public void setTreeStrategy(TreeStrategy tree) {
        this.tree = tree;
        setTreeAdapter(tree);
    }

    /**
     * method setTreeAdapter mengadaptasi tree yang diinginkan
     * ke dalam format fruit.
     * @param tree berisi objek tree yang ingin dikonversi ke fruit
     */
    public void setTreeAdapter(TreeStrategy tree) {
        this.fruit = new TreeAdapter(tree);
    }

    /**
     * method mediaPlayer memanggil method dari objek tree
     * tujuannya untuk mengabil tree yang diinginkan.
     * @param start jika bernilai true tree diambil,
     * jika bernilai false tree selesai.
     */
    public void mediaPlayer(Boolean start) {
        tree.watch(start);
    }

    /**
     * method mediaReader memanggil method read dari objek fruit
     * tujuannya untuk membuka file fruit yang diinginkan.
     * @param start jika bernilai true file fruit dibuka,
     * jika bernilai false file fruit ditutup/selesai dibaca.
     */
    public void mediaReader(Boolean start) {
        fruit.read(start);
    }
}
