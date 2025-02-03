/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS2;

/**
 *
 * @author ADVENTA
 */
public class Premium extends Customer implements Biaya {

    private double diskon = 0.25;
    private double totalBiaya, Harga;

    public double getDiskon() {
        return diskon * 100;
    }

    public double getHarga() {
        return Harga;
    }

    public void setHarga(double Harga) {
        this.Harga = Harga;
    }

    @Override
    public double totalBiaya() {
        return totalBiaya = getHarga() - (getHarga() * diskon);
    }

    @Override
    String getMember() {
        return "PREMIUM";
    }

}
