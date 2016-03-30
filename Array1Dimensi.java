/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1dimensi;

/**
 *
 * @author Ma'is
 */
import java.util.Scanner;
public class Array1Dimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner masukan = new Scanner (System.in);
    int jumbil, total=0;
    float rata2;
    System.out.println ("Berapa banyak bilangan ?");
    jumbil = masukan.nextInt();
    int data[] = new int [jumbil];
    for (int i=0;i<jumbil;i++){
        System.out.println("Masukan data ke-" + (i+1)+" :");
        data[i]= masukan.nextInt();
        total = total + data[i];
    }
    System.out.println("Nilai rata-rata dari : ");
    for (int i=0;i<(jumbil-1);i++)
        System.out.println(data[i] + " + ");
       System.out.println(data[jumbil-1]+ " adalah ");
        rata2 = total/jumbil;
        System.out.println(rata2);
    }
    
}
