/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS2;

import java.util.Scanner;

/**
 * 1
 *
 * @author ADVENTA
 */
public class MainSalon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String treatment = "";
        double harga = 0;
        double hargaSatuan = 0;

        Salon salon = new Salon("BEAUTY LAB", "JL. NUSA INDAH No. 62");
        System.out.print("Masukkan jumlah customer : ");
        int jml = sc.nextInt();

        //deklarasi array
        Customer[] cust;

        //alokasi array
        cust = new Customer[jml];

        System.out.println("SELAMAT DATANG DI " + salon.getNamaSalon() + " SALON ");
        System.out.println("\nDAFTAR HARGA TREATMENT");
        System.out.println("1. Rebounding Rp. 250.000 ");
        System.out.println("2. Smoothing Rp. 230.000");
        System.out.println("3. Creambath Rp. 25.000  ");
        System.out.println("4. Hair Coloring Rp.100.000");
        System.out.println("5. Spa Rp. 300.000");

        System.out.println("\nPILIHAN KATEGORI MEMBER");
        System.out.println("- Premium   ");
        System.out.println("- VIP    ");
        System.out.println("- No Member");

        for (int i = 0; i < jml; i++) {

            System.out.println("\nCustomer " + (i + 1));
            System.out.print("Masukkan nama customer     : ");
            String namaCus = sc.next();
            System.out.print("Masukkan alamat customer   : ");
            String alamatCus = sc.next();
            System.out.print("Masukkan nomor id customer : ");
            String noIdCus = sc.next();
            System.out.print("Masukkan kategori member   : ");
            String member = sc.next();

            Treatment treat = new Treatment() {
            };
            if (member.equalsIgnoreCase("Premium")) {
                System.out.println("\nPremium");
                System.out.println("1. Rebounding");
                System.out.println("2. Smoothing");
                System.out.println("3. Creambath");
                System.out.println("4. Hair Coloring");
                System.out.println("5. Spa");
                System.out.print("Berapa jumlah treatment :");
                int jmlTreat = sc.nextInt();

                for (int j = 0; j < jmlTreat; j++) {
                    System.out.print("Pilihan treatment : ");
                    treatment = sc.next();
                    hargaSatuan = treat.hargaTreatment(member, treatment);
                    if (hargaSatuan == 0) {
                        System.out.println("!! Pilihan " + treatment + " tidak ada");
                        j = j - 1;
                    } else {
                        harga = harga + hargaSatuan;
                    }
                }
                cust[i] = new Premium();
                Premium pre;
                pre = (Premium) cust[i];
                cust[i].setNamaCus(namaCus);
                cust[i].setAlamatCus(alamatCus);
                cust[i].setNoIdCus(noIdCus);
                pre.setHarga(harga);
                System.out.println("* Total biaya " + jmlTreat + " treatment Rp. " + harga);
                System.out.println("--------------------------------------------");

            } else if (member.equalsIgnoreCase("VIP")) {
                harga = 0;
                System.out.println("\nVIP");
                System.out.println("1. Rebounding");
                System.out.println("2. Smoothing");
                System.out.println("3. Creambath");
                System.out.println("4. Hair Coloring");
                System.out.print("Berapa jumlah treatment : ");
                int jmlTreat = sc.nextInt();

                for (int j = 0; j < jmlTreat; j++) {
                    System.out.print("Pilihan treatment : ");
                    treatment = sc.next();
                    hargaSatuan = treat.hargaTreatment(member, treatment);
                    if (hargaSatuan == 0) {
                        System.out.println("!! Pilihan " + treatment + " tidak ada");
                        j = j - 1;
                    } else {
                        harga = harga + hargaSatuan;
                    }
                }

                cust[i] = new VIP();
                VIP pip;
                pip = (VIP) cust[i];
                cust[i].setNamaCus(namaCus);
                cust[i].setAlamatCus(alamatCus);
                cust[i].setNoIdCus(noIdCus);
                pip.setHarga(harga);
                System.out.println("* Total biaya " + jmlTreat + " treatment Rp. " + harga);
                System.out.println("--------------------------------------------");

            } else if (member.equalsIgnoreCase("NoMember")) {
                harga = 0;
                System.out.println("\nNo Member");
                System.out.println("1. Hair Coloring");
                System.out.println("2. Spa");
                System.out.print("Berapa jumlah treatment : ");
                int jmlTreat = sc.nextInt();

                for (int j = 0; j < jmlTreat; j++) {
                    System.out.print("Pilihan treatment : ");
                    treatment = sc.next();
                    hargaSatuan = treat.hargaTreatment(member, treatment);
                    if (hargaSatuan == 0) {
                        System.out.println("!! Pilihan " + treatment + " tidak ada");
                        j = j - 1;
                    } else {
                        harga = harga + hargaSatuan;
                    }
                }

                cust[i] = new NoMember();
                NoMember no;
                no = (NoMember) cust[i];
                cust[i].setNamaCus(namaCus);
                cust[i].setAlamatCus(alamatCus);
                cust[i].setNoIdCus(noIdCus);
                no.setHarga(harga);
                System.out.println("* Total biaya " + jmlTreat + " treatment Rp. " + harga);
                System.out.println("--------------------------------------------");

            }

            salon.setCust(cust);

        }
        System.out.println("\n=====================================================");
        System.out.println("\t\t" + salon.getNamaSalon() + " SALON\t\t");
        System.out.println("\t\t" + salon.getAlamatSalon() + "\t\t");
        System.out.println("=====================================================");
        System.out.println("\t\tDATA PENGUNJUNG \t\t");
        System.out.println("=====================================================");
        Customer[] tampil = salon.getCust();
        for (int i = 0; i < tampil.length; i++) {

            System.out.println("Nama         : " + tampil[i].getNamaCus());
            System.out.println("Alamat       : " + tampil[i].getAlamatCus());
            System.out.println("No id        : " + tampil[i].getNoIdCus());
            System.out.println("Jenis member : " + tampil[i].getMember());

            if (tampil[i] instanceof Premium) {
                Premium pre;
                pre = (Premium) tampil[i];
                System.out.println("Harga treatment : " + pre.getHarga());
                System.out.println("Total diskon : " + pre.getDiskon() + "%");
                System.out.println("Harga diskon Rp. " + (pre.getHarga() - pre.totalBiaya()));
                System.out.println("Total pembayaran Rp. " + pre.totalBiaya());
                System.out.println("--------------------------------------------");

            } else if (tampil[i] instanceof VIP) {
                VIP pip;
                pip = (VIP) tampil[i];
                System.out.println("Harga treatment : " + pip.getHarga());
                System.out.println("Total diskon : " + pip.getDiskon() + "%");
                System.out.println("Harga diskon Rp. " + (pip.getHarga() - pip.totalBiaya()));
                System.out.println("Total pembayaran Rp. " + pip.totalBiaya());
                System.out.println("--------------------------------------------");

            } else if (tampil[i] instanceof NoMember) {
                NoMember no;
                no = (NoMember) tampil[i];
                System.out.println("Harga treatment : " + no.getHarga());
                System.out.println("Total diskon : - ");
                System.out.println("Harga diskon : - ");
                System.out.println("Total pembayaran Rp. " + no.totalBiaya());
                System.out.println("--------------------------------------------");

            }

        }

    }

}
