package TreeAdapter;

import Tree.*;

/**
 * class TreeAdapter
 * Mengadaptasi tree agar bisa dibaca dalam bentuk manga
 */
public class TreeAdapter implements Fruit {
    /**
     * objek tree dari class TreeStrategy
     * merupakan tree yang akan dikonversi.
     */
    TreeStrategy tree;


    /**
     * constructor TreeAdapter akan mengisi nilai untuk objek tree.
     * @param tree
     */
    public TreeAdapter(TreeStrategy tree)
    {
        this.tree = tree;
    }

    @Override
    public void read(Boolean start)
    {
        if(start) {
            System.out.println(">>>Membuka fruit "+ tree.getName() +"<<<");
        } else {
            System.out.println("<<<Fruit "+ tree.getName() +" telah selesai>>>");
        }
    }
}
