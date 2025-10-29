/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.praktikumpemrograman2.modul05;

import javax.swing.*;

/**
 *
 * @author Asus
 */
public class Latihan1 {
    public static void main(String[] args) {
        //menjalankan kode GUI di Event Dispatch Thread (EDT)
        //ini adalah praktik terbaik untuk menghindari masalah thread
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                //1. buat objek JFrame
                JFrame frame = new JFrame ("Jendela pertamaku");
                
                //2.Atur ukuran jendela (lebar 400, tinggi 300)
                frame.setSize(400, 300);
                
                //3. atur aksi saat tombol close(x) ditekan
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                //4. buat jendela terlihat
                frame.setVisible(true);
            }
        });
    }
}
