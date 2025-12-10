/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.praktikumpemrograman2.modul09;

import java.io.Serializable;
/**
 *
 * @author Asus
 */
public class UserConfig implements Serializable{
    private String username;
    private int fontsize;
    
    public String getUsername(){
        return username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public int getFontSize(){
        return fontsize;
    }
    
    public void setFontSize(int fontsize){
        this.fontsize = fontsize;
    }
    
    
    
}
