
package sewakamera;

import java.util.ArrayList;

public class StockBarang {
    int idStock = 1; //default id stock
    
    //otomatis dibuat setelah membuat objek stockBarang
    ArrayList<Kamera> stockKamera = new ArrayList<Kamera>();
    
    //method untuk menambah kamera
    public void tambahKamera(String jenis, String nama, int harga, int tahun, int count){
        stockKamera.add(new Kamera(idStock, jenis, nama, harga, tahun, count, 1));
        stockKamera.get(getLastIndex()).setRate(harga);
        idStock++;
    }
    
    //method menghapus kamera
    public void hapusStock(int id){
        for(int i=0; i<stockKamera.size(); i++){
            if(id==stockKamera.get(i).idBarang){
                stockKamera.remove(i);
            }
        }
    }
    
    //method edit stock
    public void editStock(int id, String jenis, String nama, int harga, int tahun, int count){
        for(int i=0; i<stockKamera.size(); i++){
            if(id==stockKamera.get(i).idBarang){
                stockKamera.get(i).setNama(nama);
                stockKamera.get(i).setJenis(jenis);
                stockKamera.get(i).setHarga(harga);
                stockKamera.get(i).setTahun(tahun);
                stockKamera.get(i).setCount(count);
            }
        }
    }
    
    //get last index
    public int getLastIndex(){
        int index = stockKamera.size()-1;
        return index;
    }
    
    //get id kamera
    public int getIDKamera(int i){
        return stockKamera.get(i).idBarang;
    }
    
    //get jenis kamera
    public String getJenisKamera(int i){
        return stockKamera.get(i).jenisBarang;
    }
    
    //get nama kamera
    public String getNamaKamera(int i){
        return stockKamera.get(i).namaBarang;
    }
    
    //get harga kamera
    public int getHargaKamera(int i){
        return stockKamera.get(i).hargaBarang;
    }
    
    //get tahun kamera
    public int getTahunKamera(int i){
        return stockKamera.get(i).thProduksi;
    }
    
    //get shutter count camera
    public int getShtCountKamera(int i){
        return stockKamera.get(i).shtCount;
    }
    
    //get status by index
    public String getStatusByIndex(int i){
        return stockKamera.get(i).getStatus();
    }
    
    //get status by id barang
    public String getStatusByID(int id){
        String status = null;
        for(int i=0; i<stockKamera.size(); i++){
            if(id==stockKamera.get(i).idBarang){
                status = stockKamera.get(i).getStatus();
            }
        }
        return status;
    }
    
    //pricing
    public double pricing(int id, double waktu){
        double hargaFinal = 0;
        for(int i=0;i<stockKamera.size();i++){
            if(id==stockKamera.get(i).idBarang){
                hargaFinal = stockKamera.get(i).rateHarga*waktu;
                break;
            }
        }
        return hargaFinal;
    }
    
    //merubah nama barang ke id
    public int toID(String nama){
        int id = 0;
        for(int i=0;i<stockKamera.size();i++){
            if(nama.equals(stockKamera.get(i).namaBarang)){
                id = stockKamera.get(i).idBarang;
                break;
            }
        }
        return id;
    }
    
    //merubah id ke nama barang
    public String toNama(int id){
        String nama = null;
        for(int i=0;i<stockKamera.size();i++){
            if(id==stockKamera.get(i).idBarang){
                nama = stockKamera.get(i).namaBarang;
                break;
            }
        }
        return nama;
    }
    
    //merubah status
    public void changeStatus(int id, int status){
        for(int i=0;i<stockKamera.size();i++){
            if(id==stockKamera.get(i).idBarang){
                stockKamera.get(i).setStatus(status);
                break;
            }
        }
    }
    
    //cek status
    public boolean isStatusReady(int id){
        boolean isReady = false;
        for(int i=0;i<stockKamera.size();i++){
            if(id==stockKamera.get(i).idBarang){
                if(stockKamera.get(i).statusBarang==1){
                    isReady = true;
                    break;
                }else if(stockKamera.get(i).statusBarang==0){
                    isReady = false;
                    break;
                }
            }
        }
        return isReady;
    }
}
