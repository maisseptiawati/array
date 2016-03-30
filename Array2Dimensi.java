/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2dimensi;

/**
 *
 * @author Ma'is
 */
import java.util.Scanner;
public class Array2Dimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int baris, kolom;
        Scanner masukan = new Scanner (System.in);
        System.out.println("Program Penjumalahan 2 Buah Matriks");
        System.out.println("Masukan jumlah baris Matriks : ");
        baris = masukan.nextInt();
        System.out.println("Masukan jumlah kolom Matriks :");
        kolom = masukan.nextInt();
        System.out.println();
        System.out.println("Masukan Data : ");
        System.out.println("Matriks 1 : ");
        int matriks1[][] = new int [baris][kolom];
        for(int i=0; i<baris; i++){
            for (int j=0;j<kolom;j++){
                System.out.println("Bil baris ke-"+i+" kolom ke-"+j+" :");
                matriks1[i][j] = masukan.nextInt();
            }
        }
        System.out.println();
        System.out.println("Matriks 2: ");
        int matriks2[][] = new int [baris][kolom];
        for (int i=0;i<baris;i++){
            for (int j=0;j<kolom;j++){
                System.out.println("Bil baris ke-"+i+" kolom ke-"+j+" :");
                matriks2[i][j] = masukan.nextInt();
            }
        }
        System.out.println("Data sebelum dijumlahkan : ");
        System.out.println("Matriks 1 : ");
        for (int i=0;i<baris;i++){
            for (int j=0;j<kolom;j++)
                System.out.println(matriks1[i][j] + " ");
            System.out.println();
        }
        System.out.println();
        System.out.println("Matriks 2 : ");
        for(int i=0;i<baris;i++){
            for (int j=0;j<kolom;j++)
                System.out.println(matriks2[i][j] +" ");
            System.out.println();
        }
        System.out.println();
        int hasil [][] = new int [baris][kolom];
        for (int i=0;i<baris;i++){
            for (int j=0;j<kolom;j++)
                System.out.println(hasil [i][j] + " ");
            System.out.println();
        }
        System.out.println();
}
}