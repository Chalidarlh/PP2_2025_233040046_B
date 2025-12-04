/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.praktikumpemrograman2.modul08;

/**
 *
 * @author Asus
 */
import id.ac.unpas.praktikumpemrograman2.modul08.controller.PersegiPanjangController;
import id.ac.unpas.praktikumpemrograman2.modul08.model.PersegiPanjangModel;
import id.ac.unpas.praktikumpemrograman2.modul08.view.PersegiPanjangView;


public class Main {
    public static void main(String[] args) {
        //1.instansiasi model
        PersegiPanjangModel model = new PersegiPanjangModel();
        
        //2, instansiasi view
        PersegiPanjangView view = new PersegiPanjangView();
        
        //3. instansiasi controller
        PersegiPanjangController controller = new PersegiPanjangController(model, view);
        
        //4.Tampilkan view
        view.setVisible(true);
    }
}
