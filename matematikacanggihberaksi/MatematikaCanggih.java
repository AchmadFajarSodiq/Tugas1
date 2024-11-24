/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematikacanggihberaksi;

/**
 *
 * @author Dell-
 */
public class MatematikaCanggih extends Matematika {
    private int operasiModulus;
    
    void setOperasiModulus(int operasiModulus) {
        this.operasiModulus = operasiModulus;
    }
    
    int getOperasiModulus() {
        return operasiModulus;
    }
    
    int modulus(int a, int b) {
        operasiModulus = (a % b);
        return operasiModulus;
    }
}
