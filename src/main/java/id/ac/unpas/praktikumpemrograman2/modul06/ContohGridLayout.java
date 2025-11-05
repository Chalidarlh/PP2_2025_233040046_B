/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.praktikumpemrograman2.modul06;

import java.awt.GridLayout;
import javax.swing.*;
/**
 *
 * @author Asus
 */
public class ContohGridLayout {
   public static void main(String[] args) {
        //1. Buat frame
        JFrame frame = new JFrame ("Contoh GridLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        //2. Atur layout frame menjadi GridLayout 3 baris dan 2 kolom
        //bisa nambah jarak antar sel juga
        frame.setLayout(new GridLayout(3, 2, 5, 5));
        
        //2. Tambahkan 6 komponen
        frame.add(new JLabel("Label 1: "));
        frame.add(new JTextField());
        frame.add(new JLabel("Label 2: "));
        frame.add(new JPasswordField());
        frame.add(new JButton("Login"));
        frame.add(new JButton("Batal"));
        
        //3. tampilkan frame
        frame.setVisible(true);
        
        //
    }
    
}
