/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.praktikumpemrograman2.modul08.model;

/**
 *
 * @author Asus
 */
public class PersegiPanjangModel {

    private double panjang;
    private double lebar;
    private double luas;
    //latihan2: menambahkan atribut keliling
    private double keliling;

    // Menghitung luas (Logika Bisnis)
    public void hitungLuas() {
        this.luas = this.panjang * this.lebar;
    }
    
    // latihan2: Menghitung keliling(Logika Bisnis)
    public void hitungKeliling() {
        this.keliling = 2 * (this.panjang + this.lebar);
    }

    // Getters dan Setters
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getLuas() {
        return luas;
    }
    
    //latihan2: menambahkan getter keliling
     public double getKeliling() {
        return keliling;
    }
}
