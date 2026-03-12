/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digitalbank;

/**
 *
 * @author Lab Informatika
 */
public class Tabungan extends User{

    public Tabungan(int saldoAwal) {
        super(saldoAwal);
    }

    @Override
    public void cetakBukti() {
        
    }
    
    public void tarikTunai(int nominal){
        System.out.println("Menarik Rp " + nominal + "dari tabungan");
        saldo -= nominal;
        
    }
    
    
}
