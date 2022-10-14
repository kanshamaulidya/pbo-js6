/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan2;

/**
 *
 * @author HP
 */
public class ClassA {
    private int x;
    private int y;
    
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
    public void getNilai(){
        System.out.println("Nilai x: " +x);
        System.out.println("Nilai y: " +y);
    }
}
