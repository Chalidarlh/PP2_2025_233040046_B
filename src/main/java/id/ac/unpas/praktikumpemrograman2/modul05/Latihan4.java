/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.praktikumpemrograman2.modul05;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Asus
 */
public class Latihan4 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                JFrame frame = new JFrame ("Contoh BorderLayout");
                frame.setSize(400, 300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                //1.atur layout manager ke borderlayout
                //FlowLayout akan menyusun komponen dari kiri ke kanan
                frame.setLayout(new BorderLayout());
                
                //2.buat komponen GUI
                JLabel label = new JLabel ("label ada diatas (north)");
                JButton button = new JButton ("tombol ada dibawah (south)");
                
                //3. tambahkan aksi ke tombol
                button.addActionListener(e -> {
                    label.setText("Tombol di south diklik!");
                });
                
                //4. tambahkan komponen ke frame dengan posisi
                frame.add(label, BorderLayout.NORTH);
                frame.add(button, BorderLayout.SOUTH);
                frame.add(new JButton("WEST"), BorderLayout.WEST);
                frame.add(new JButton("EAST"), BorderLayout.EAST);
                frame.add(new JButton("CENTER"), BorderLayout.CENTER);
                
                
                frame.setVisible(true);
                        
            }
        });
    }
    
}
