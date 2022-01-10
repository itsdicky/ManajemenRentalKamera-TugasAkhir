
package sewakamera;

public class Kamera {
    int thProduksi,shtCount,idKamera,hargaKamera,statusKamera;
    int rasio = 100;
    String jenisKamera,namaKamera;
    double rateHarga;
    
    //constructor
    Kamera(int id,String jenis,String nama,int harga,int tahun,int count,int status){
        idKamera = id;
        jenisKamera = jenis;
        namaKamera = nama;
        hargaKamera = harga;
        thProduksi = tahun;
        shtCount = count;
        statusKamera = status;
        rateHarga = harga/this.rasio;
    }
    
    /*
    Kamera(String nama){
        namaKamera = nama;
    } */
    
    /*
    Kamera(int id){
        idKamera = id;
    } */

    //method get status, dipakai saat menampilkan ke tabelStock
    public String getStatus(){
        String stringStatus = null;
        if(this.statusKamera==0){
            stringStatus = "Booked";
        }else if(this.statusKamera==1){
            stringStatus = "Ready";
        }
        return stringStatus;
    }

    //method set status
    public void setStatus(int binary){
        this.statusKamera = binary;
    }
    
    //method set rate harga
    /*
    public void setRate(int harga){
        this.rateHarga = harga/this.rasio;
    } */
    
    //set nama kamera
    public void setNama(String nama){
        this.namaKamera = nama;
    }
    
    //set jenis kamera
    public void setJenis(String jenis){
        this.jenisKamera = jenis;
    }
    
    //set harga kamera
    public void setHarga(int harga){
        this.hargaKamera = harga;
        this.rateHarga = harga/this.rasio;
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
