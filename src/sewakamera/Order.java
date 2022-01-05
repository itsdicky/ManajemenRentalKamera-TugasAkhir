
package sewakamera;

import java.util.ArrayList;

public class Order {
    

    //idOrder awal
    private int idOrder = 0;
    
    //Array data order
    ArrayList<OrderData> dataOrder = new ArrayList<OrderData>();
    
    //method untuk membuat data order baru
    public void newOrder(long nik,String nama,String alamat,String notlp,int id,String waktu,String bayar){
        idOrder++;
        dataOrder.add(new OrderData(idOrder, nik, nama, alamat, notlp, id, waktu, bayar));
    }
    
    //method menghapus data order
    public void hapusOrder(int id){
        for(int i=0; i<dataOrder.size(); i++){
            if(id==dataOrder.get(i).idOrder){
                dataOrder.remove(i);
            }
        }
    }
    
    // method get last index
    public int getLastIndex(){
        int index = dataOrder.size()-1;
        return index;
    }
    
    //get id
    public int getOrderID(int i){
        //mendapatkan id order terakhir
        return dataOrder.get(i).idOrder;
    }
    
    //get nik
    public long getOrderNik(int i){
        return dataOrder.get(i).nikData;
    }
    
    //get nama
    public String getOrderNama(int i){
        return dataOrder.get(i).namaData;
    }
    
    //get alamat
    public String getOrderAlamat(int i){
        return dataOrder.get(i).alamatData;
    }
    
    //get notlp
    public String getOrderNotlp(int i){
        return dataOrder.get(i).notlpData;
    }
    
    //get idkam
    public int getOrderIDBarang(int i){
        return dataOrder.get(i).idBarangData;
    }
    
    //get waktu
    public String getOrderWaktu(int i){
        return dataOrder.get(i).waktuData;
    }
    
    //get bayar
    public String getOrderBayar(int i){
        return dataOrder.get(i).bayarData;
    }
}
