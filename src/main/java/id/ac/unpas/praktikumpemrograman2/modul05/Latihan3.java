/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.praktikumpemrograman2.modul05;

import java.awt.FlowLayout;
import javax.swing.*;
/**
 *
 * @author Asus
 */
public class Latihan3 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                JFrame frame = new JFrame ("Label dan Tombol");
                frame.setSize(400, 300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                //1.atur layout manager
                //FlowLayout akan menyusun komponen dari kiri ke kanan
                frame.setLayout(new FlowLayout());
                
                //2.buat komponen GUI
                JLabel label = new JLabel ("Teks Awal");
                JButton button = new JButton ("Klik saya");
                
                //3. tambahkan aksi ke tombol
                button.addActionListener(e -> {
                    label.setText("Tombol berhasil diklik");
                });
                
                //4. tambahkan komponen ke frame
                frame.add(label);
                frame.add(button);
                
                frame.setVisible(true);
                        
            }
        });
    }
}
