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
public class Pegawai extends Dosen {
   private String nip;
   private String nama;
   private String alamat;
   
   public void Pegawai(String nip, String nama, String alamat){
       this.nip= nip;
       this.nama = nama;
       this.alamat = alamat;
   }
   public String getNama(){
       return nama;
   }
   public void setNama(String nama){
       this.nama=nama;
   }
   public String getNip(){
       return nip;
   }
   public void setNip(String nip){
       this.nip=nip;
   }
   public String getAlamat(){
       return alamat;
   }
   public void setAlamat(String alamat){
       this.alamat=alamat;
   }
   public int getTotalGaji(){
       System.out.println("Nama    : "+nama);
       System.out.println("Nip     : " +nip);
       System.out.println("Alamat  : " +alamat);
       System.out.println("Gaji    : " + getGaji());
       return 0;
   }

    
   
}
