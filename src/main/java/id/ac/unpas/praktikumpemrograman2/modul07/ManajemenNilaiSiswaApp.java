/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.praktikumpemrograman2.modul07;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Asus
 */
public class ManajemenNilaiSiswaApp extends JFrame{
    private JTextField txtNama;
    private JTextField txtNilai;
    private JComboBox<String> cmbMatkul;
    private JTable tableData;
    private DefaultTableModel tableModel;
    private JTabbedPane tabbedPane;
    
    public ManajemenNilaiSiswaApp(){
            //1.konfigurasi frame utama
            setTitle("Aplikasi Manajemen Nilai Siswa");
            setSize(500, 400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null); //posisi ditengah layar
            
            //2.inisialisasi tabbed pane
            tabbedPane = new JTabbedPane();
            
            //3.membuat panel untuk tab 1
            JPanel panelInput = createInputPanel();
            tabbedPane.addTab("Daftar Nilai", panelInput);
            
            //4.membuat panel untuk tab 2
            JPanel panelTabel = createTablePanel();
            tabbedPane.addTab("Daftar Nilai", panelTabel);
            
            //menambahkan TabbedPane ke Frame
            add(tabbedPane);
        }
    
    //method untuk membuat desain Tab Input
    private JPanel createInputPanel(){
        JPanel panel = new JPanel (new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        //komponen nama
        panel.add(new JLabel("Nama Siswa:"));
        txtNama = new JTextField();
        panel.add(txtNama);
        
        //komponen mata pelajaran
        panel.add(new JLabel("Mata Pelajaran: "));
        String[] matkul = {"Matematika Dasar", "Bahasa Indonesia", 
            "Algoritma dan Pemrograman", "Praktikum Pemrograman"};
        cmbMatkul = new JComboBox<>(matkul);
        panel.add(cmbMatkul);
        
        //komponen nilai
        panel.add(new JLabel("Nilai(0-100):"));
        txtNilai = new JTextField();
        panel.add(txtNilai);
        
        //tombol simpan
        JButton btnSimpan = new JButton("Simpan Data");
        panel.add(new JLabel("")); //placeholder kosong
        panel.add(btnSimpan);
        
        //event handling tombol simpan
        btnSimpan.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                prosesSimpan();
            }
        });
        return panel;   
    }
    
    
    //method untuk membuat desain tab tabel
    private JPanel createTablePanel(){
        JPanel panel = new JPanel (new BorderLayout());
        
        //Setup model tabel (kolom)
        String[] kolom = {"Nama Siswa", "Mata Pelajaran", "Nilai", "Grade"};
        tableModel = new DefaultTableModel(kolom, 0);
        tableData = new JTable(tableModel);
        
        //membungkus tabel dengan scrollpane (agar bisa discroll jika data banyak)
        JScrollPane scrollPane = new JScrollPane(tableData);
        panel.add(scrollPane, BorderLayout.CENTER);
        
        return panel;
    }
    
    //logika validasi dan penyimpanan data
    private void prosesSimpan(){
        //1.ambil data dari input
        String nama = txtNama.getText();
        String matkul = (String) cmbMatkul.getSelectedItem();
        String strNilai = txtNilai.getText();
        
        //2.validasi input
        
        //validasi 1:cek apakah nama kosong
        if(nama.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Nama tidak boleh kosong",
                    "Error Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //validasi 2: cek apakah nilai berupa angka dan dalam range valid
        int nilai;
        try{
            nilai = Integer.parseInt(strNilai);
            if (nilai < 0 || nilai > 100){
                JOptionPane.showMessageDialog(this, "Nilai harus antara 0-100!",
                        "Erroe Validasi", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }catch (NumberFormatException e){
            JOptionPane.showConfirmDialog(this, "Nilai harus berupa angka!",
                    "Error Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //3.Logika bisnis (menentukan grade)
        String grade;
        if(nilai >= 80) grade = "A";
        else if (nilai >= 70) grade ="AB";
        else if (nilai >= 60) grade ="B";
        else if (nilai >= 50) grade ="BC";
        else if (nilai >= 40) grade ="C";
        else if (nilai >= 30) grade ="D";
        else grade = "E";
        
        //4. Maukkan ke tabel
        Object[] dataBaris = {nama, matkul, nilai, grade};
        tableModel.addRow(dataBaris);
        
        //5. reset form dan pindah tab
        txtNama.setText("");
        txtNilai.setText("");
        cmbMatkul.setSelectedIndex(0);
        
        JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
        tabbedPane.setSelectedIndex(1); //otomatis pindah ke tab tabel
        
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            new ManajemenNilaiSiswaApp().setVisible(true);
        });
 }
}
    
    
