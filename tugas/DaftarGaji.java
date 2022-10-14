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
public class DaftarGaji {
    public static void main(String[] args){
    Pegawai p = new Pegawai();
    p.setNip("2131710148");
    p.setNama("Kansha");
    p.setAlamat("Nganjuk");
    p.setSKS(19);
    p.setTarif(20000);
    p.getTotalGaji();
    
    }   
}
