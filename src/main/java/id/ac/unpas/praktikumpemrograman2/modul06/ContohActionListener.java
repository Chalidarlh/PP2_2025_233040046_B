/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.praktikumpemrograman2.modul06;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
/**
 *
 * @author Asus
 */
public class ContohActionListener {
    public static void main(String[] args) {
        JFrame frame = new JFrame ("Contoh ActionListener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());
        
        //1. buat komponen
        JLabel label = new JLabel("Halo, klik tombol dibawah!");
        JButton button = new JButton("Klik saya");
        
        //2.buat event listener
        ActionListener listener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //3. logika yang dieksekusi saat event terjadi
                label.setText("Tombol telah diklik");
            }
            
        };
        
        //4. daftarkan listener ke source
        button.addActionListener(listener);
        
        //Tambahkan komponen ke frame
        frame.add(label);
        frame.add(button);
        frame.setVisible(true);
  
        
    }
    
}
