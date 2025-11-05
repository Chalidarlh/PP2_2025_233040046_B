/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.praktikumpemrograman2.modul06;

import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author Asus
 */
public class ContohBorderLayout {
    public static void main(String[] args) {
        //1. Buat frame
        JFrame frame = new JFrame ("Contoh BorderLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        //2. Buat dan tambahkan komponen ke 5 wilayah
        frame.add(new JButton("NORTH"), BorderLayout.NORTH);
        frame.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        frame.add(new JButton("WEST"), BorderLayout.WEST);
        frame.add(new JButton("EAST"), BorderLayout.EAST);
        frame.add(new JButton("CENTER"), BorderLayout.CENTER);
        
        //3. tampilkan frame
        frame.setVisible(true);
        
        
    }
    
}
