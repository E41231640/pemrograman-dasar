/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_promdas;
import java.util.Scanner;

/**
 *
 * @author dini hanifa
 */
public class Tugas_promdas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang balok: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar balok: ");
        double lebar = input.nextDouble();
        // Menghitung luas alas balok
        double luasAlas = panjang * lebar;
        System.out.println("Luas alas balok adalah: " + luasAlas);
        input.close();
    }
}

   
    

