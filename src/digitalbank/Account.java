/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digitalbank;

import com.sun.source.util.DocSourcePositions;

/**
 *
 * @author Lab Informatika
 */
public class Account extends User {
    
    public Account(int saldoAwal){
        super(saldoAwal);
    }
  
    @Override
    public void cetakBukti() {
        System.out.println("Deposito Saldo: Rp " + saldo);
    }
    
}
