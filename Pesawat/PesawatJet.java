public class PesawatJet extends Pesawat {

        public void info(){
            super.setNamaPesawat("Autobot404") ;
            super.setTahunProduksi(2000) ;
            super.setKecepatan(3000) ;
            super.getNamaPesawat();
            super.getTahunProduksi();
            super.getKecepatan();

        Accesoris a1 = new Accesoris() ;
        a1.setWarnaPesawat("hitam", "oren");
        a1.getWarnaPesawat();
        Mesin mesin = new Mesin();
        mesin.setJarakTempuh(2000.6);
        mesin.setKecepatanMesin(6000.6);
        mesin.getJarakTempuh();
        mesin.getKecepatanMesin();
     
        a1.nos();
        
        

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
