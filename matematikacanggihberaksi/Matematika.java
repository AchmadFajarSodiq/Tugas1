/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematikacanggihberaksi;

/**
 *
 * @author Dell-
 */
public class Matematika {
    private int operasi;
    
    void setOperasi(int operasi) {
        this.operasi = operasi;
    }
    
    int getOperasi() {
        return operasi;
    }
    
    int pertambahan(int a, int b) {
        operasi = (a + b);
        return operasi;
    }
    
    int pengurangan(int a, int b) {
        operasi = (a - b);
        return operasi;
    }
   
    int perkalian(int a, int b) {
        operasi = (a * b);
        return operasi;
    }
    
    int pembagian(int a, int b) {
        operasi = (a / b);
        return operasi;
    }
}
