package tubesSTRUKDIS;

import java.util.Scanner;

public class QueueMain {
	public static void main(String[] args) {
            Queue qu = new Queue();
            Scanner sc = new Scanner(System.in);
            int pilihan;
            String keluar;
            do {
                System.out.println(" SELAMAT DATANG ");
                System.out.println("===DAFTAR MENU===");
                System.out.println("[1] ENQUE");
                System.out.println("[2] ENQUEUE");
                System.out.println("[3] SIZE ");
                System.out.println("[4] EMPTY");
                System.out.println("[5] CARI");
                System.out.println("[6] DATA QUEUE");
                System.out.println("[00] LOGOUT");
                System.out.println("================");
                System.out.print("MASUKKAN PILIHAN ANDA : ");
                pilihan = sc.nextInt();
                System.out.println();

                switch (pilihan) {
                case 1: {
                        System.out.print("Masukan Elemen : ");
                        qu.enque(sc.nextInt());
                        System.out.println("Elemen Ditambahkan");
                        break;
                }
                case 2: {
                        qu.dequeue();
                        System.out.println("Element dihapus");
                        break;
                }
                case 3: {
                        System.out.println("Size Queue : " + qu.size());
                        break;
                }
                case 4: {
                        System.out.println("Queue Empty : " + qu.isEmpty());
                        break;
                }
                case 5: {
                        System.out.println("Masukan Elemen yang dicari : ");
                        qu.cari(sc.nextInt());
                        break;
                }
                case 6: {
                        qu.displayElement();
                        break;
                }
                case 00: {
                        System.out.println("TERIMA KASIH");
                        System.exit(0);
                        break;
                }
                default: {
                        System.out.println("PILIHAN MENU TIDAK SESUAI");
                        System.out.println();
                        }
                }
                System.out.println("Mencoba yang lain?");
                System.out.println("y = YA/ n = TIDAK ");
                keluar = sc.next();
            } while (keluar.equalsIgnoreCase("y"));

	}
}
