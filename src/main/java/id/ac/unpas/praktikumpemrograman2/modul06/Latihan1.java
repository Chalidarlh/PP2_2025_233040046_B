/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.praktikumpemrograman2.modul06;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.*;
/**
 *
 * @author Asus
 */
public class Latihan1 {
    public static void main(String[] args) {
        //1. Buat frame
        JFrame frame = new JFrame ("Kalkulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        //2. Buat panel untuk tombol
        JPanel panelTombol = new JPanel();
        panelTombol.setLayout(new GridLayout(4, 4, 5, 5));
        
        //3. Tanbahin tombol
        panelTombol.add(new JButton("7"));
        panelTombol.add(new JButton("8"));
        panelTombol.add(new JButton("9"));
        panelTombol.add(new JButton("/"));
        panelTombol.add(new JButton("4"));
        panelTombol.add(new JButton("5"));
        panelTombol.add(new JButton("6"));
        panelTombol.add(new JButton("x"));
        panelTombol.add(new JButton("1"));
        panelTombol.add(new JButton("2"));
        panelTombol.add(new JButton("3"));
        panelTombol.add(new JButton("-"));
        panelTombol.add(new JButton("+"));
        panelTombol.add(new JButton("0"));
        panelTombol.add(new JButton(","));
        panelTombol.add(new JButton("="));
        
        //4. mengatur bagian atas
        JTextField layar = new JTextField();
        frame.add(layar, BorderLayout.NORTH);
        
        //5. Tambahkan panel ke frame di bagian center
        frame.add(panelTombol, BorderLayout.CENTER);
        
        //6. Tampilkan frame
        frame.setVisible(true);
        
        
        
        
        
        

    }
    
}
