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
public abstract class Customer {

    private String namaCus, alamatCus, noIdCus;

    public String getNamaCus() {
        return namaCus;
    }

    public String getAlamatCus() {
        return alamatCus;
    }

    public String getNoIdCus() {
        return noIdCus;
    }

    public void setNamaCus(String namaCus) {
        this.namaCus = namaCus;
    }

    public void setAlamatCus(String alamatCus) {
        this.alamatCus = alamatCus;
    }

    public void setNoIdCus(String noIdCus) {
        this.noIdCus = noIdCus;
    }

    abstract String getMember();

}
