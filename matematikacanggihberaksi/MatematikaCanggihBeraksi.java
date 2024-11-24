/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematikacanggihberaksi;

/**
 *
 * @author Dell-
 */
public class MatematikaCanggihBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MatematikaCanggih mc = new MatematikaCanggih();
        
        mc.pertambahan(5, 5);
        System.out.println("Hasil Pertambahan= " + mc.getOperasi());
        
        mc.perkalian(5, 2);
        System.out.println("Hasil Perkalian= " + mc.getOperasi());
        
        mc.modulus(5, 2);
        System.out.println("Hasil Modulus= " + mc.getOperasiModulus());
    }
    
}
