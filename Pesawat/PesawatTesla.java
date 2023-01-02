

public class PesawatTesla extends Pesawat {
    

    public void info(){

            super.setNamaPesawat("Musk404") ;
            super.setTahunProduksi(2000) ;
            super.setKecepatan(3000) ;
            super.getNamaPesawat();
            super.getTahunProduksi();
            super.getKecepatan();
        Accesoris accesoris = new Accesoris();
        accesoris.setWarnaPesawat("oren" , "hitam");
        accesoris.getWarnaPesawat();
        accesoris.setWeapon("Rudal");
        accesoris.getWeapon();
        
        
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
