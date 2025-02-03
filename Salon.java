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
public class Salon {

    private String namaSalon;
    private String alamatSalon;
    private Customer[] cust;

    public Salon() {
    }

    public Salon(String namaSalon, String alamatSalon) {
        this.namaSalon = namaSalon;
        this.alamatSalon = alamatSalon;
    }

    public String getNamaSalon() {
        return namaSalon;
    }

    public void setNamaSalon(String namaSalon) {
        this.namaSalon = namaSalon;
    }

    public String getAlamatSalon() {
        return alamatSalon;
    }

    public void setAlamatSalon(String alamatSalon) {
        this.alamatSalon = alamatSalon;
    }

    public Customer[] getCust() {
        return cust;
    }

    public void setCust(Customer[] cust) {
        this.cust = cust;
    }

}
