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
public class Treatment {

    public double hargaTreatment(String member, String treatment) {
        double Harga = 0.0;
        if ("premium".equals(member) && ("rebounding".equals(treatment) || "1".equals(treatment))) {
            Harga = 250000.00;

        } else if ("premium".equals(member) && ("smoothing".equals(treatment) || "2".equals(treatment))) {
            Harga = 230000.0;

        } else if ("premium".equals(member) && ("creambath".equals(treatment) || "3".equals(treatment))) {
            Harga = 25000.0;

        } else if ("premium".equals(member) && ("haircoloring".equals(treatment) || "4".equals(treatment))) {
            Harga = 100000.0;

        } else if ("premium".equals(member) && ("spa".equals(treatment) || "5".equals(treatment))) {
            Harga = 300000.0;

        } else if ("vip".equals(member) && ("rebounding".equals(treatment) || "1".equals(treatment))) {
            Harga = 250000.0;

        } else if ("vip".equals(member) && ("smoothing".equals(treatment) || "2".equals(treatment))) {
            Harga = 230000.0;

        } else if ("vip".equals(member) && ("creambath".equals(treatment) || "3".equals(treatment))) {
            Harga = 25000.0;

        } else if ("vip".equals(member) && ("haircoloring".equals(treatment) || "4".equals(treatment))) {
            Harga = 100000.0;

        } else if ("nomember".equals(member) && ("haircoloring".equals(treatment) || "1".equals(treatment))) {
            Harga = 100000.0;

        } else if ("nomember".equals(member) && ("spa".equals(treatment) || "2".equals(treatment))) {
            Harga = 300000.0;

        } else {
            return 0.0;
        }

        return Harga;

    }

}
