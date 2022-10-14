/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author HP
 */
public class Dosen {
    private int jumlahSKS;
    private int tarifSKS;
    
    public void Dosen(int jumlahSKS, int tarifSKS){
        this.jumlahSKS=jumlahSKS;
        this.tarifSKS=tarifSKS;
    }
    public int getSKS(){
        return jumlahSKS;
    }
    public void setSKS(int jumlahSKS){
       this.jumlahSKS=jumlahSKS;
    }
    public int getTarif(){
        return tarifSKS;
    }
    public void setTarif(int tarifSKS){
        this.tarifSKS = tarifSKS;
    }
    public int getGaji(){
        return (tarifSKS*jumlahSKS);
    }
}
