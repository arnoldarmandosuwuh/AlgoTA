/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algota;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arnold
 */
public class AlgoTA {

    /**
     * @param args the command line arguments
     */
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("==Menu Utama==");
        System.out.println("==============");
        System.out.println("1. Menu xxxxx");
        System.out.println("2. Menu yyyyy");
        System.out.println("3. Menu Menghitung Matriks");
        System.out.print("Masukkan pilihan anda : ");
        int pil = input.nextInt();
        switch (pil) {
            case 1:
                try {
                    Robot pressbot = new Robot();
                    pressbot.keyPress(17); // Holds CTRL key.
                    pressbot.keyPress(76); // Holds L key.
                    pressbot.keyRelease(17); // Releases CTRL key.
                    pressbot.keyRelease(76); // Releases L key.
                    //Memanggil function nomor 1
                    hitungVolume1a();
                    //Memanggil function nomor 2
                    //hitungVolume1b();
                    //Memanggil function nomor 3
                    //hitungSuhu1c();
                    //Memanggil function nomor 4
                    //hitungSuhu1d();
                    //Memanggil function nomor 5
                    //hitungSuhu1e();
                    //Memanggil function nomor 6
                    //hitungFaktor1f();
                    //Memanggil function nomor 7
                    //hitungFaktorial1g();
                    //Memanggil function nomor 8
                    //hitungLuas1h();
                    //Memanggil function nomor 9
                    //itungGaya1i();
                    //Memanggil function nomor 10
                    //hitungKecepatan1j();
                } catch (AWTException ex) {
                    Logger.getLogger(AlgoTA.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 2:
                try {
                    Robot pressbot = new Robot();
                    pressbot.keyPress(17); // Holds CTRL key.
                    pressbot.keyPress(76); // Holds L key.
                    pressbot.keyRelease(17); // Releases CTRL key.
                    pressbot.keyRelease(76); // Releases L key.
                    //Memanggil function nomor 1
                    hitungSuhu2a();
                    //Memanggil function nomor 2
                    //hitungSuhu2b();
                    //Memanggil function nomor 3
                    //hitungPermutasi2c();
                    //Memanggil function nomor 4
                    //hitungKombinasi2d();
                    //Memanggil function nomor 5
                    //hitungRata2e();
                    //Memanggil function nomor 6
                    //hitungJarak2f();
                    //Memanggil function nomor 7
                    //hitungEK2g(); 
                    //Memanggil function nomor 8
                    //hitungEP2h(); 
                    //Memanggil function nomor 9
                    //hitungBil2i();
                    //Memanggil function nomor 10
                    //hitungFib2j();
                } catch (AWTException ex) {
                    Logger.getLogger(AlgoTA.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            default:
                break;
        }
    }

    //Menu xxxxx
    public static void hitungVolume1a() {
        System.out.print("Masukkan Diameter : ");
        double d = input.nextDouble();
        System.out.print("Masukkan Tinggi : ");
        double t = input.nextDouble();
        double r = d / 2;
        double volume = Math.PI * r * r * t;
        System.out.println("Volume Tabung : " + volume);
    }

    public static void hitungVolume1b() {
        System.out.print("Masukkan Diameter : ");
        double d = input.nextDouble();
        double r = d / 2;
        double volume = 4 * Math.PI * r * r * r / 3;
        System.out.println("Volume Bola : " + volume);
    }

    public static void hitungSuhu1c() {
        System.out.print("Masukkan Suhu Celsius : ");
        double c = input.nextDouble();
        double f = (9 * c / 5) + 32;
        System.out.println("Suhu Fahrenheit : " + f);
    }

    public static void hitungSuhu1d() {
        System.out.print("Masukkan Suhu Reamur : ");
        double r = input.nextDouble();
        double f = (9 * r / 4) + 32;
        System.out.println("Suhu Fahrenheit : " + f);
    }

    public static void hitungSuhu1e() {
        System.out.print("Masukkan Suhu Celsius : ");
        int c = input.nextInt();
        int k = c + 273;
        System.out.println("Suhu Kelvin : " + k);
    }

    public static void hitungFaktor1f() {
        System.out.print("Masukkan Bilangan : ");
        int bil = input.nextInt();
        int x = 0;
        System.out.println("Faktor dari " + bil + " : ");
        for (int i = 0; i <= bil; i++) {
            x++;
            if (bil % x == 0) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
    }

    public static void hitungFaktorial1g() {
        System.out.print("Masukkan Bilangan : ");
        int bil = input.nextInt();
        int hasil = 1;
        System.out.print(bil + "! : ");
        for (int i = bil; i >= 1; i--) {
            hasil *= i;
        }
        System.out.println(hasil);
    }

    public static void hitungLuas1h() {
        System.out.print("Masukkan Sisi : ");
        int s = input.nextInt();
        int luas = 6 * s * s;
        System.out.println("Luas Permukaan Kubus : " + luas);
    }

    public static void hitungGaya1i() {
        System.out.print("Masukkan Massa : ");
        double m = input.nextDouble();
        System.out.print("Masukkan Percepatan : ");
        double a = input.nextDouble();
        double F = m * a;
        System.out.println("=========================");
        System.out.println("Menghitung Gaya Newton II");
        System.out.println("Massa = " + m + " kg" + "\n"
                + "Percepatan = " + a + " m/s2" + " \n"
                + "Gaya = " + F + " N");
    }

    public static void hitungKecepatan1j() {
        System.out.print("Masukkan Jarak Tempuh : ");
        double s = input.nextDouble();
        System.out.print("Masukkan Waktu Tempuh : ");
        double t = input.nextDouble();
        double v = s / t;
        System.out.println("Jarak Tempuh = " + s + " m" + "\n"
                + "Waktu Tempuh = " + t + " s" + " \n"
                + "Kecepatan = " + v + " m/s");
    }

    //Menu yyyyy
    public static void hitungSuhu2a() {
        System.out.print("Masukkan Suhu Fahrenheit : ");
        double f = input.nextDouble();
        double k = (5 * (f - 32) / 9) + 273;
        System.out.println("Suhu Kelvin : " + k);
    }

    public static void hitungSuhu2b() {
        System.out.print("Masukkan Suhu Kelvin : ");
        double k = input.nextDouble();
        double r = 4 * (k - 273) / 5;
        System.out.println("Suhu Reamur : " + r);
    }

    public static void hitungPermutasi2c() {
        System.out.print("Masukkan n : ");
        double n = input.nextDouble();
        System.out.print("Masukkan r : ");
        double r = input.nextDouble();
        double nF = 1, x, nr = 1;
        for (double i = n; i >= 1; i--) {
            nF *= i;
        }
        x = n - r;
        for (double i = x; i >= 1; i--) {
            nr *= i;
        }
        double p = nF / nr;
        System.out.println("Permutasi (" + (int) n + "," + (int) r + ") : " + p);
    }

    public static void hitungKombinasi2d() {
        System.out.print("Masukkan n : ");
        double n = input.nextDouble();
        System.out.print("Masukkan r : ");
        double r = input.nextDouble();
        double nF = 1, x, nr = 1, rF = 1;
        for (double i = n; i >= 1; i--) {
            nF *= i;
        }
        for (double i = r; i >= 1; i--) {
            rF *= i;
        }
        x = n - r;
        for (double i = x; i >= 1; i--) {
            nr *= i;
        }
        double p = nF / (rF * nr);
        System.out.println("Permutasi (" + (int) n + "," + (int) r + ") : " + p);
    }

    public static void hitungRata2e() {
        System.out.print("Masukkan Nilai Quiz : ");
        double q = input.nextDouble();
        System.out.print("Masukkan Nilai UTS : ");
        double ut = input.nextDouble();
        System.out.print("Masukkan Nilai UAS : ");
        double ua = input.nextDouble();
        double r = (q + ut + ua) / 3;
        System.out.println("Nilai Quiz = " + q + "\n"
                + "Nilai UTS = " + ut + "\n"
                + "Nilai UAS = " + ua + "\n"
                + "Nilai Rata-rata = " + r);
    }

    public static void hitungJarak2f() {
        System.out.print("Masukkan Kecepatan : ");
        double v = input.nextDouble();
        System.out.print("Masukkan Waktu Tempuh : ");
        double t = input.nextDouble();
        double s = v * t;
        System.out.println("Kecepatan = " + v + " m/s" + "\n"
                + "Waktu Tempuh = " + t + " s" + " \n"
                + "Jarak Tempuh = " + s + " m");
    }

    public static void hitungEK2g() {
        System.out.print("Masukkan Massa : ");
        double m = input.nextDouble();
        System.out.print("Masukkan Kecepatan : ");
        double v = input.nextDouble();
        double ek = 0.5 * m * v * v;
        System.out.println("Massa = " + m + " kg" + "\n"
                + "Kecepatan = " + v + " m/s" + " \n"
                + "Energi Kinetik = " + ek + " J");
    }

    public static void hitungEP2h() {
        System.out.print("Masukkan Massa : ");
        double m = input.nextDouble();
        System.out.print("Masukkan Ketinggian : ");
        double h = input.nextDouble();
        double g = 10;
        double ep = m * g * h;
        System.out.println("Massa = " + m + " kg" + "\n"
                + "Ketinggian = " + h + " m" + " \n"
                + "Percepatan Gravitasi = " + g + " m/s2" + " \n"
                + "Energi Potensial = " + ep + " J");
    }

    public static void hitungBil2i() {
        System.out.print("Masukkan Jumlah n : ");
        int n = input.nextInt();
        int x = 0, y = 0;
        System.out.print("Bilangan Ganjil : ");
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                x += i;
            }
        }
        System.out.println();
        System.out.print("Bilangan Genap : ");
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                y += i;
            }
        }
        System.out.println();
        System.out.println("Jumlah Seluruh Bilangan Ganjil : " + x);
        System.out.println("Jumlah Seluruh Bilangan Genap : " + y);
    }

    public static void hitungFib2j() {
        int a = 0, b = 1, c, n;
        System.out.print("Masukkan Jumlah n : ");
        n = input.nextInt();

        if (n == 1) {
            System.out.print(a);
        } else if (n > 0 && n <= 2) {
            System.out.print(a + " " + b);
        } else if (n > 2) {
            System.out.print(a + " " + b);
            for (int i = 3; i <=n; i++) {
                c = a + b;
                System.out.print(" " + c);
                a = b;
                b = c;
            }
        }
        System.out.println();
    }
}
