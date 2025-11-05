/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.praktikumpemrograman2.modul06;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Asus
 */
public class Latihan2 {
    public static void main(String[] args) {
        // 1. Membuat frame utama
        JFrame frame = new JFrame("Konverter Suhu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(3, 2, 5, 5)); 

        // 2. Membuat komponen
        JLabel labelCelcius = new JLabel("Celcius:");
        JTextField inputCelcius = new JTextField();
        JButton btnKonversi = new JButton("Konversi");
        JLabel labelFahrenheit = new JLabel("Fahrenheit:");
        JLabel hasilFahrenheit = new JLabel("");

        // 3. Menambahkan komponen ke frame
        frame.add(labelCelcius);
        frame.add(inputCelcius);
        frame.add(new JLabel(""));
        frame.add(btnKonversi);
        frame.add(labelFahrenheit);
        frame.add(hasilFahrenheit);

        // 4. Menambahkan ActionListener pada tombol
        btnKonversi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Ambil input dari JTextField
                    String teks = inputCelcius.getText();
                    double celcius = Double.parseDouble(teks);

                    // Rumus konversi Celcius ke Fahrenheit
                    double fahrenheit = (celcius * 9 / 5) + 32;

                    // Tampilkan hasil ke JLabel
                    hasilFahrenheit.setText(String.format("%.2f °F", fahrenheit));
                } catch (NumberFormatException ex) {
                    // Jika input bukan angka
                    JOptionPane.showMessageDialog(frame,
                            "Input harus berupa angka!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // 5. Menampilkan frame
        frame.setVisible(true);
    }
    
}
