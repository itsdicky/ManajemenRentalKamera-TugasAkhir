
package sewakamera;

public class OrderData {
    //data person
    long nikData;
    String namaData;
    String alamatData;
    String notlpData;
    
    //data barang
    int idBarangData;
    
    //detail order
    int idOrder; //default id order
    String waktuData;
    String bayarData;
    
    //constructor
    OrderData(int idOr,long nik,String nama,String alamat,String notlp,int id,String waktu,String bayar){
        idOrder = idOr;
        nikData = nik;
        namaData = nama;
        alamatData = alamat;
        notlpData = notlp;
        idBarangData = id;
        waktuData = waktu;
        bayarData = bayar;
        
        //membuat newPerson
        Person newPerson = new Person(nikData,namaData,alamatData,notlpData);
    }
}
