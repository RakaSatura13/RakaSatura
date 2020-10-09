package com.raka.modul1.Obejct;

public class Objek {
    public static void main(String[] args) {
        //Deklarasi ojbect tanpa Parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();

        mahasiswaTanpa.setNama("raka");
        mahasiswaTanpa.setNim(19104026);

        System.out.println("Mahasiswa 1 ");
        System.out.println("Nama\t: "+mahasiswaTanpa.getNama());
        System.out.println("Nim\t\t: "+mahasiswaTanpa.getNim());


        Mahasiswa mahasiswa = new Mahasiswa("joss",19104040);
        System.out.println("Mahasiswa 2 ");
        System.out.println("Nama\t: "+mahasiswa.getNama());
        System.out.println("Nim\t\t: "+mahasiswa.getNim());

    }
}

