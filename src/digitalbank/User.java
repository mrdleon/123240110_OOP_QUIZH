/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digitalbank;

/**
 *
 * @author Lab Informatika
 */
public abstract class User {
    protected int saldo;
    
    public User(int saldoAwal){
        this.saldo = saldoAwal;
    }
    
//   public String GetName(){
//       return name;
//   }
    
    public abstract  void cetakBukti();
}
