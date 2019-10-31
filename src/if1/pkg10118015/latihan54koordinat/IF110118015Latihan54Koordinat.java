/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan54koordinat;

/**
 *
 * @author
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : Program ini berisi program koordinat
 */
public class IF110118015Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WarnaKoordinat kd = new WarnaKoordinat(10, 4, "Jingga");
        System.out.println("Warna Koordinat : "+ kd.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+ kd.getX()+", y : "+kd.getY());
    }
    
}
