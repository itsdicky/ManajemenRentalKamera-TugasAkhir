
package sewakamera;

public class Barang {
    int idBarang;
    String jenisBarang;
    String namaBarang;
    int hargaBarang;
    int statusBarang;
    int rasio = 100;
    double rateHarga;
    
    //method get status, dipakai saat menampilkan ke tabelStock
    public String getStatus(){
        String stringStatus = null;
        if(this.statusBarang==0){
            stringStatus = "Booked";
        }else if(this.statusBarang==1){
            stringStatus = "Ready";
        }
        return stringStatus;
    }
    
    //method set status
    public void setStatus(int binary){
        this.statusBarang = binary;
    }
    
    //method set rate harga
    public void setRate(int harga){
        this.rateHarga = harga/this.rasio;
    }
}
