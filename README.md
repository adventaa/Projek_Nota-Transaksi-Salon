# Projek_Nota-Transaksi-Salon
Projek dalam mata kuliah Pemrograman Berorientasi Objek. Membuat nota transaksi dari pilihan layanan salon.
Terdapat 8 class, yaitu  class main (MainSalon), class Salon yang berisi atribut dari data 
salon, abstract class Customer (induk) yang berisi atribut dari data-data customer. 
Class Biaya yang merupakan kelas interface, digunakan menentukan bentuk 
metode yang dapat digunakan oleh sejumlah kelas. Berisi method untuk 
menghitung total biaya. Class NoMember, class VIP, class Premium (extends 
Customer implements Biaya) yang artinya class NoMember, VIP, Premium berisi 
objek nama, alamat, noId Customer, sehingga extends digunakan untuk 
mendapatkan sifat-sifat atau atribut dari class induk (Customer) ke dalam 
subclass. Merupakan kelas implementasi dari kelas Biaya, sehingga digunakan 
untuk mengimplementasikan suatu interface ke dalam suatu class, dan memiliki 
method override dengan nama beserta signature (daftar parameter) yang sama 
dengan nama beserta signature di superclass nya. Class Treatment merupakan 
class yang berdiri sendiri dan memiliki method berisi percabangan untuk 
menentukan harga treatment sesuai dengan kategori customer dan jenis treatment 
yang dipilih.
