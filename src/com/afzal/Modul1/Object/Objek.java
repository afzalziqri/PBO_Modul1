package com.afzal.Modul1.Object;

public class Objek {
    public static void main(String[] args) {
        //Deklarasi ojbect tanpa Parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();

        mahasiswaTanpa.setNama("Afzal");
        mahasiswaTanpa.setNim(19104002);

        System.out.println("Mahasiswa 1 ");
        System.out.println("Nama\t: "+mahasiswaTanpa.getNama());
        System.out.println("Nim\t\t: "+mahasiswaTanpa.getNim());

        Mahasiswa mahasiswa1Param = new Mahasiswa("Alimin");
        System.out.println("Mahasiswa 2 ");
        System.out.println("Nama\t: "+mahasiswa1Param.getNama());
        System.out.println("Nim\t\t: "+mahasiswa1Param.getNim());

        Mahasiswa mahasiswa = new Mahasiswa("Alimin",19104092);
        System.out.println("Mahasiswa 2 ");
        System.out.println("Nama\t: "+mahasiswa.getNama());
        System.out.println("Nim\t\t: "+mahasiswa.getNim());
    }
}
