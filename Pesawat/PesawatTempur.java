public class PesawatTempur extends Pesawat {
    public void info( ){
        super.setNamaPesawat("Enola404") ;
        super.setTahunProduksi(2000) ;
        super.setKecepatan(3000) ;
        super.getNamaPesawat();
        super.getTahunProduksi();
        super.getKecepatan();



        Accesoris accesoris = new Accesoris();
        accesoris.setWarnaPesawat("hitam", "putih");
        accesoris.getWarnaPesawat();
        Mesin mesin1 = new Mesin();
        mesin1.setJarakTempuh(200.5);
        mesin1.setKecepatanMesin(6000.4);
        mesin1.getKecepatanMesin();
        mesin1.getJarakTempuh();
        

    }
    @Override
    public void turnOn() {
        // TODO Auto-generated method stub
        super.turnOn();
    }
    @Override
    public void fly() {
        // TODO Auto-generated method stub
        super.fly();
    }
    @Override
    public void landing() {
        // TODO Auto-generated method stub
        super.landing();
    }
    @Override
    public void turnOff() {
        // TODO Auto-generated method stub
        super.turnOff();
    }
}
