/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.praktikumpemrograman2.modul06;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
        
/**
 *
 * @author Asus
 */
public class ContohMouseListener {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contoh MouseListener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        
        //1. buat komponen(event source)
        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setPreferredSize(new Dimension(200, 200));
        
        //2. Buat event listener (menggunakan MouseAdapter)
        MouseAdapter adapter = new MouseAdapter(){
            @Override
            public void mouseEntered (MouseEvent e){
                //saat mouse masuk, ubah warna menjadi mgenta
                panel.setBackground(Color.MAGENTA);
            }
            public void mouseExited (MouseEvent e){
                //saat mouse keluar, ubah warna menjadi abu
                panel.setBackground(Color.LIGHT_GRAY);
            }
            public void mouseCliked (MouseEvent e){
                //saat diklik, tampilkan koordinat klik
                System.out.println("Mouse diklik di: x-" + e.getX()+ ", Y=" + e.getY());
            }
            
        };
        
        //3. Daftarkan listener ke source
        panel.addMouseListener(adapter);
        
        frame.add(panel);
        frame.setVisible(true);
    }
    
}
