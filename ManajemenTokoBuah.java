// Program ini banya mengandung materi OOP


import java.util.ArrayList;
import java.util.Scanner;

class Buah {
    private String nama;
    private double harga;
    private int stok;

    public Buah(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void tambahStok(int jumlah) {
        stok += jumlah;
    }

    public void kurangiStok(int jumlah) {
        if (stok >= jumlah) {
            stok -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi.");
        }
    }
}

public class ManajemenTokoBuah {
    private static ArrayList<Buah> daftarBuah = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean programBerjalan = true;

        while (programBerjalan) {
            System.out.println("\n===== Program Manajemen Toko Buah =====");
            System.out.println("1. Tambah Buah");
            System.out.println("2. Tampilkan Daftar Buah");
            System.out.println("3. Cari Buah");
            System.out.println("4. Hapus Buah");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan Anda: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tambahBuah();
                    break;
                case 2:
                    tampilkanDaftarBuah();
                    break;
                case 3:
                    cariBuah();
                    break;
                case 4:
                    hapusBuah();
                    break;
                case 5:
                    programBerjalan = false;
                    System.out.println("Terima kasih telah menggunakan program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }

    private static void tambahBuah() {
        System.out.print("Masukkan nama buah: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan harga buah: ");
        double harga = scanner.nextDouble();
        System.out.print("Masukkan stok buah: ");
        int stok = scanner.nextInt();

        Buah buahBaru = new Buah(nama, harga, stok);
        daftarBuah.add(buahBaru);
        System.out.println("Buah berhasil ditambahkan.");
    }

    private static void tampilkanDaftarBuah() {
        System.out.println("\n===== Daftar Buah =====");
        for (Buah buah : daftarBuah) {
            System.out.println("Nama: " + buah.getNama());
            System.out.println("Harga: " + buah.getHarga());
            System.out.println("Stok: " + buah.getStok());
            System.out.println("--------------------------");
        }
    }

    private static void cariBuah() {
        System.out.print("Masukkan nama buah yang ingin dicari: ");
        String namaCari = scanner.nextLine();

        boolean ditemukan = false;
        for (Buah buah : daftarBuah) {
            if (buah.getNama().equalsIgnoreCase(namaCari)) {
                System.out.println("\n===== Detail Buah =====");
                System.out.println("Nama: " + buah.getNama());
                System.out.println("Harga: " + buah.getHarga());
                System.out.println("Stok: " + buah.getStok());
                System.out.println("--------------------------");
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Buah tidak ditemukan.");
        }
    }

    private static void hapusBuah() {
        System.out.print("Masukkan nama buah yang ingin dihapus: ");
        String namaHapus = scanner.nextLine();

        boolean berhasil = false;
        for (Buah buah : daftarBuah) {
            if (buah.getNama().equalsIgnoreCase(namaHapus)) {
                daftarBuah.remove(buah);
                System.out.println("Buah berhasil dihapus.");
                berhasil = true;
                break;
            }
        }

        if (!berhasil) {
            System.out.println("Buah tidak ditemukan.");
        }
    }
}
