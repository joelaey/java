import java.util.Scanner;

public class OperationController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        Operation op = new Operation();
        
        System.out.println("\nSelamat datang di program Operasi Aritmatika !\n");

        boolean program = true;

        while(program){
            System.out.print(
                "Operasi apa yang anda inginkan?\n\n"+
                "1. Kalkulator\n"+
                "2. Hitung Luas & Keliling persegi\n"+
                "3. Hitung Luas & Keliling persegi panjang\n"+
                "4. Hitung Luas & Keliling lingkaran\n"+
                "5. Konversi Suhu\n\n"+
                "Masukan pilihan anda dengan mengetikan nomor / angka urutannya (1, 2, 3, atau 4) / (* Masukan angka 0 untuk exit) : "
            );
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("\nMasukan angka pertama : ");
                    double angkaKalku1 = sc.nextDouble();
                    System.out.print("\nMasukan angka kedua : ");
                    double angkaKalku2 = sc.nextDouble();
                    System.out.println("\nHasilnya adalah : " + op.calculator(angkaKalku1, angkaKalku2) + "\n");
                    break;
                
                case 2:
                    System.out.print("\nMasukan panjang dari sisi persegi : ");
                    double sisiPersegi = sc.nextDouble();
                    System.out.println("\nHasilnya adalah : " + op.persegi(sisiPersegi) + "\n");
                    break;

                case 3:
                    System.out.print("\nMasukan panjang : ");
                    double angkaPp1 = sc.nextDouble();
                    System.out.print("\nMasukan lebar : ");
                    double angkaPp2 = sc.nextDouble();
                    System.out.println("\nHasilnya adalah : " + op.persegiPanjang(angkaPp1, angkaPp2) + "\n");
                    break;
                
                case 4:
                    System.out.print("\nMasukan jari-jari lingkaran : ");
                    double jariJari = sc.nextDouble();
                    System.out.println("\nHasilnya adalah : " + op.lingkaran(jariJari) + "\n");
                    break;

                case 5:
                    System.out.print("\nMasukan suhu yang akan di konversi : ");
                    double suhu = sc.nextDouble();
                    System.out.println("\nHasilnya adalah : " + op.konversiSuhu(suhu) + "\n");
                    break;

                case 0:
                    System.out.println("\nProgram Keluar . . . . .\n");
                    program = false;
                    break;

                default:
                    System.out.println("\nError input yang dimasukan tidak valid, coba lagi ! \n");
                    break;
            }
        }
    }
}


// Class Operation dan OperationController itu harus di pisah di dua file yang berbeda agar lebih paham mengenai class dan method :)
// Dan yang di run itu yang OperationController sementara Operation hanya berisi method method biasa yang method main nya ada di Operation Controller

import java.util.Scanner;

public class Operation{
    public Double calculator(double angkaSatu, double angkaDua){
        Scanner sc = new Scanner(System.in);
            double hasil = 0;

            System.out.print(
                "\nPilih operasi yang di inginkan :\n\n" +
                "1. Pertambahan\n" +
                "2. Pengurangan\n" +
                "3. Perkalian\n" +
                "4. Pembagian\n" +
                "5. Modulus\n\n" +
                "Pilih operasi yang di inginkan (1 ,2 ,3 ,4 , atau 5) : "
                );
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    hasil = angkaSatu + angkaDua;
                    break;
                case 2:
                    hasil = angkaSatu - angkaDua;
                    break;
                case 3:
                    hasil = angkaSatu * angkaDua;
                    break;
                case 4:
                    hasil = angkaSatu / angkaDua;
                    break;
                case 5:
                    hasil = angkaSatu % angkaDua;
                    break;
                default:
                    System.out.println("Error input sesuai dengan instruksi yang diberikan !");
                    break;
            }
        return (double) hasil;
    }

    public Double persegi (double s){
        Scanner sc = new Scanner(System.in);
        double hasil = 0;

        System.out.print(
            "\nOperasi persegi apa yang anda inginkan?\n\n"+
             "1. Kelining\n"+
             "2. Luas\n\n"+
             "Masukan angka (1 / 2) untuk memilih operasi : "
        );

        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                hasil = 4*s;
                break;
            case 2:
                hasil = s*s;
                break;
            default:
                System.out.println("Error input tidak sesuai !");
                break;
        }
        return hasil;

    }

    public Double persegiPanjang(double p, double l){
        Scanner sc = new Scanner(System.in);
        double hasil = 0;

        System.out.print(
            "\nOperasi persegi panjang apa yang anda inginkan?\n\n"+
             "1. Kelining\n"+
             "2. Luas\n\n"+
             "Masukan angka (1 / 2) untuk memilih operasi : "
        );

        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                hasil = 2 * (p + l);
                break;
            case 2:
                hasil = p*l;
                break;
            default:
                System.out.println("Error input tidak sesuai !");
                break;
        }
        return hasil;

    }

    public Double lingkaran (double r){
        Scanner sc = new Scanner(System.in);
        double hasil = 0;

        System.out.print(
            "\nOperasi lingkaran apa yang anda inginkan?\n\n"+
             "1. Kelining\n"+
             "2. Luas\n\n"+
             "Masukan angka (1 / 2) untuk memilih operasi : "
        );

        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                hasil = 2 * Math.PI * r;
                break;
            case 2:
                hasil = Math.PI * (r * r);
                break;
            default:
                System.out.println("Error input tidak sesuai !");
                break;
        }
        return hasil;

    }
    public Double konversiSuhu (double value) {
        Scanner sc = new Scanner(System.in);
        double hasil = 0;

        System.out.print(
                "\nPilih operasi yang di inginkan :\n\n" +
                        "1. Celcius to Fahrenheit\n" +
                        "2. Fahrenheit to Celcius\n" +
                        "3. Celcius to Kelvin\n" +
                        "4. Kelvin to Celcius\n" +
                        "5. Fahrenheit to Kelvin\n" +
                        "6. Kelvin to Fahrenheit\n\n" +
                        "Pilih operasi yang di inginkan (1, 2, 3, 4, 5, atau 6) : "
        );

        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                hasil = (value * 9 / 5) + 32;
                break;
            case 2:
                hasil = (value - 32) * 5 / 9;
                break;
            case 3:
                hasil = value + 273.15;
                break;
            case 4:
                hasil = value - 273.15;
                break;
            case 5:
                hasil = (value - 32) * 5 / 9 + 273.15;
                break;
            case 6:
                hasil = (value - 273.15) * 9 / 5 + 32;
                break;
            default:
                System.out.println("Error input sesuai dengan instruksi yang diberikan !");
                break;
        }

        return hasil;
    }
}
