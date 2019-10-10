/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 */
public class IF0110118025Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Kalimat;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan Kalimat : ");
        Kalimat = scan.nextLine();
        String Kapital = Kalimat.toUpperCase();
        String Kecil = Kalimat.toLowerCase();
        
        System.out.println("====Hasil Formatting====");
        System.out.printf("Huruf Besar\t : " + Kapital);
        System.out.printf("%nHuruf Kecil\t : " + Kecil);
        System.out.println("");
    }
    
}
