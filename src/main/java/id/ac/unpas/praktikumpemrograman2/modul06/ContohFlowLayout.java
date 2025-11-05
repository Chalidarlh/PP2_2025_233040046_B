/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.praktikumpemrograman2.modul06;

import java.awt.FlowLayout;
import javax.swing.*;


/**
 *
 * @author Asus
 */
public class ContohFlowLayout {
    public static void main(String[] args) {
        //1. Buat Frame (Window)
        JFrame frame = new JFrame ("Contoh Flowlayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        
        //2. Buat panel (container)
        //JPanel secara default sudah menggunakan FlowLayout
        JPanel panel = new JPanel();
        //bisa diatur secara eksplisit
        //panel.setLayout (new Flowlayout(FlowLayout.CENTER));
        
        //3.Buat dan tambahkan komponen
        panel.add(new JButton("Tombol 1"));
        panel.add(new JButton("Tombol 2"));
        panel.add(new JButton("Tombol Tiga"));
        panel.add(new JButton("Tombol Empat Panjang"));
        panel.add(new JButton("Tombol"));
        
        //4. Tambahkan panel ke frame
        frame.add(panel);
        
        //5. Tampilkan frame
        frame.setVisible(true);
    }
}
