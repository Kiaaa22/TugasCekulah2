/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendataan.baju;

import java.util.Scanner;

/**
 *
 * @author zaskiakiaa
 */
public class merkBaju extends PendataanBaju {

    public void merkbaju() {
        System.out.println("Merk baju yang ada di Toko" + super.bidang);
    }

    public String nama, jb;
    public int np, wjp;

//overriding
    public void bagianbaju() {
        //bagian jenis pakaian

        Scanner input = new Scanner(System.in);
        System.out.println(" Zara       (1)");
        System.out.println(" Nevada     (2)");
        System.out.println(" Uniqlo     (3)");
        System.out.println(" H&m        (4)");
        System.out.println(" Gucci      (5)");

        System.out.println("Pilih salah satu id merk baju diatas: ");
        int id = input.nextInt();
        switch (id) {
            case 1: {
                System.out.println("Nama : Zara");
                System.out.println("Jenis baju : Gamis");
                System.out.println("Nomor pakaian : 1111");
                System.out.println(3);
            }

            case 2: {
                System.out.println("Nama : Nevada");
                System.out.println("Jenis baju : Kaos");
                System.out.println("Nomor pakaian : 2222");
                System.out.println(1);
            }

            case 3: {
                System.out.println("Nama : Uniqlo");
                System.out.println("Jenis Baju : Hoodie ");
                System.out.println("Nomor pakaian : 3333");
                System.out.println(3);
            }

            case 4: {
                System.out.println("Nama : H&m");
                System.out.println("Jenis Baju : Jaket ");
                System.out.println("Nomor pakaian : 4444");
                System.out.println(3);
            }

            case 5: {
                System.out.println("Nama : Gucci ");
                System.out.println("Jenis Baju : Kaos ");
                System.out.println("Nomor pakaian : 5555");
                System.out.println(1);
            }
            default:
                System.out.println("Error! id pakaian tidak ditemukan");

        }
    }
}