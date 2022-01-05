
package sewakamera;

public class Lensa extends Barang{
    String fcLength;
    
    //constructor
    Lensa(int id,String jenis,String nama,int harga,String length){
        idBarang = id;
        jenisBarang = jenis;
        namaBarang = nama;
        hargaBarang = harga;
        fcLength = length;
    }
}
