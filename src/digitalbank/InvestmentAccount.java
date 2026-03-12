/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digitalbank;

/**
 *
 * @author Lab Informatika
 */
public class InvestmentAccount implements Runnable {
    
//    private int SavingsAccountekening;
//    private int InvestmentAccount;
//    private int FXAccount;
    private Tabungan rekening;
    private int nominalTarik;
    
    public InvestmentAccount(Tabungan rekening, int nominalTarik){
        this.rekening = rekening;
        this.nominalTarik = nominalTarik;
    }
    
    

//    public InvestmentAccount(int SavingsAccountekening,int InvestmentAccount,int FXAccount) {
//        this.SavingsAccountekening = SavingsAccountekening;
//        this.InvestmentAccount = InvestmentAccount;
//        this.FXAccount = FXAccount;
//    }
            
    @Override
    public void run() {
        try {
            rekening.tarikTunai(nominalTarik);
        } catch (Exception e) {
        }
    }
    
    
}
