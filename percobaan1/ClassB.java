/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan1;

/**
 *
 * @author HP
 */
public class ClassB extends ClassA {
    public int z;
    
    public void getNilaiZ(){
        System.out.println("Nilai z: " +z);
    }
    public void getJumlah(){
        System.out.println("Jumlah: " +(x+y+z));
    }
}
