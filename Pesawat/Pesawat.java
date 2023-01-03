abstract class Pesawat {

    String namaPesawat ;
    int tahunProduksi ;
    double kecepatan ;
    
    
    public String setNamaPesawat(String namaPesawat){
        this.namaPesawat = namaPesawat ;
        return namaPesawat ;

    }
    public void getNamaPesawat(){
        System.out.println("nama pesawat ini :  " +namaPesawat);
    }

    public int setTahunProduksi(int tahunProduksi){
        this.tahunProduksi = tahunProduksi ;
        return tahunProduksi ;
    }
    public void getTahunProduksi(){
        

        System.out.println("tahun produksi : " + tahunProduksi);

    }

    public double setKecepatan(double kecepatan){
        this.kecepatan = kecepatan ;
        return kecepatan ;
    }


    public void getKecepatan(){
        System.out.println("Kecepatan pesawat : " +kecepatan + "km/jam");
    }



    public void turnOn(){
        System.out.println("mesin pesawat dinyalakan");
    }
    

    public void fly(){
        System.out.println("pesawat terbang");
    }
    public void landing(){
        System.out.println("pesawat mendarat");
    }
    public void turnOff() {
        System.out.println("mesin pesawat dimatikan");
    }
}
