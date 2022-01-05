
package sewakamera;

public class Kamera extends Barang {
    int thProduksi;
    int shtCount;
    
    //constructor
    Kamera(int id,String jenis,String nama,int harga,int tahun,int count,int status){
        idBarang = id;
        jenisBarang = jenis;
        namaBarang = nama;
        hargaBarang = harga;
        thProduksi = tahun;
        shtCount = count;
        statusBarang = status;
    }
    
    Kamera(String nama){
        namaBarang = nama;
    }
    
    Kamera(int id){
        idBarang = id;
    }  
    
    //set nama kamera
    public void setNama(String nama){
        this.namaBarang = nama;
    }
    
    //set jenis kamera
    public void setJenis(String jenis){
        this.jenisBarang = jenis;
    }
    
    //set harga kamera
    public void setHarga(int harga){
        this.hargaBarang = harga;
    }
    
    //set tahun kamera
    public void setTahun(int tahun){
        this.thProduksi = tahun;
    }
    
    //set shuttercount kamera
    public void setCount(int count){
        this.shtCount = count;
    }
}
