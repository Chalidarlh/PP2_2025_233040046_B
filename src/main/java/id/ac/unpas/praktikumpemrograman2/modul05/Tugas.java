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
public class Tugas {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                JFrame frame = new JFrame ("Contoh BorderLayout");
                frame.setSize(400, 300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                //1. atur layout manager ke borderlayout
                frame.setLayout(new BorderLayout());
                
                //2. buat komponen GUI
                JLabel label = new JLabel ("label ada di atas (NORTH)");
                JButton btnSouth = new JButton ("tombol ada di bawah (SOUTH)");
                JButton btnNorth = new JButton ("NORTH");
                JButton btnWest = new JButton ("WEST");
                JButton btnEast = new JButton ("EAST");
                JButton btnCenter = new JButton ("CENTER");
                
                //3. tambahkan aksi ke tombol
                btnSouth.addActionListener(e -> {
                    label.setText("Tombol SOUTH diklik!");
                });
                
                btnNorth.addActionListener(e -> {
                    label.setText("Tombol NORTH diklik!");
                });
                
                btnWest.addActionListener(e -> {
                    label.setText("Tombol WEST diklik!");
                });
                
                btnEast.addActionListener(e -> {
                    label.setText("Tombol EAST diklik!");
                });
                
                btnCenter.addActionListener(e -> {
                    label.setText("Tombol CENTER diklik!");
                });
                
                //4. tambahkan komponen ke frame dengan posisi
                frame.add(label, BorderLayout.NORTH);
                frame.add(btnSouth, BorderLayout.SOUTH);
                frame.add(btnWest, BorderLayout.WEST);
                frame.add(btnEast, BorderLayout.EAST);
                frame.add(btnCenter, BorderLayout.CENTER);
                
                frame.setVisible(true);
            }
        });
    }
}