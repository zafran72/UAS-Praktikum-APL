import java.util.Scanner;

import Tree.*;

/**
 * Class Main
 * Yang menjalankan implementasi dari pattern yang sudah dibuat
 */
public class Main {
    /**
     * Membuat objek
     * objek input untuk menerima input(scanner)
     * objek anime untuk menampung tree yang dipilih
     */
    static Scanner input = new Scanner(System.in);
    static TreeContext tree;

    public static void main(String[] args) {
        tree = new TreeContext();
        String lanjut = "y";
        
        // Akan terus mengulang program selama user masih menginput "y"
        while(lanjut.equals("y")) {

            pilihJudul();
            System.out.println();

            System.out.print("Tekan 'y' bila ingin mengulang: ");
            lanjut = input.nextLine();
            lanjut = input.nextLine();

            // Jika program dihentikan
            if(!lanjut.equals("y")) {
                System.out.println();
                System.out.println(">>>Terima kasih sudah menggunakan layanan kami :)");
                break;
            }
            System.out.println("----------------------------");
        } 
	}
        
    /**
     * Berisi scanner agar bisa memilih tree mana
     * yang ingin diadaptasi ke fruit.
     */
    public static void pilihJudul() {
        System.out.println();
        System.out.println("Pilih judul");
        System.out.println("1. Durian");
        System.out.println("2. Mango");
        System.out.println("3. Apple");
        System.out.print("Pilihan: ");

        int option = Main.input.nextInt();

		switch(option) {
            // Jika dipilih tree Durian
			case 1 :
                // Menset tree yang dipilih
				tree.setTreeStrategy(new DurianStrategy());

                /*  Memilih metode(ingin dalam bentuk atau
                atau dikonversi ke fruit) */
                setMetode();
				break;

            // Jika dipilih tree Mango
			case 2:
                tree.setTreeStrategy(new MangoStrategy());
                setMetode();
				break;

            // Jika dipilih tree Apple
			case 3:
                tree.setTreeStrategy(new AppleStrategy());
                setMetode();
				break;
            default:
                System.out.println("Inputan kamu salah, silakan pilih ulang!!!");
                pilihJudul();
		}
    }

    /**
     * Berisi scanner untuk memilih apakah ingin
     * langsung mengambil tree
     * atau
     * diubah ke format fruit terlebih dahulu untuk diambil.
     */
    public static void setMetode() {
        System.out.println();
        System.out.println("Pilih Metode");
        System.out.println("1. Ambil tree");
        System.out.println("2. Ambil fruit");
        System.out.print("Pilihan: ");
        int choice = 0;
        choice = input.nextInt();

        // Kondisi jika ingin langsung mengambil dalam format tree
        if(choice == 1) {
            /* Memanggil method mediaPlayer untuk memutar 
            dan juga menghentikan tree jika sudah selesai*/
            tree.mediaPlayer(true);
            tree.mediaPlayer(false);
        }

        // Kondisi jika ingin mengubah tree ke format fruit
        else if(choice == 2) {
            /* Memanggil method mediaReader untuk membuka 
            dan juga menutup file fruit jika sudah selesai*/
            tree.mediaReader(true);
            tree.mediaReader(false);
        }
        // Jika input bukan 1 atau 2
        else{
            System.out.println("Inputan kamu salah, silakan pilih ulang!!!");
            setMetode();
        }
    }
}
