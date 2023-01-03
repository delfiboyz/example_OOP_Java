interface MesinPesawat{
    double setKecepatanMesin(double kecepatanMesin);
    void getKecepatanMesin();
    double setJarakTempuh(double jarakTempuh);
    void getJarakTempuh();
}

public class Mesin implements MesinPesawat{
    protected double kecepatanMesin ;
    protected double jarakTempuh ;
    @Override
    public double setKecepatanMesin(double kecepatanMesin) {
        // TODO Auto-generated method stub
        this.kecepatanMesin = kecepatanMesin;
        return kecepatanMesin;
    }
    @Override
    public void getKecepatanMesin() {
        // TODO Auto-generated method stub
        System.out.println("kecepatan mesin : " + kecepatanMesin + " km/jam");
        
    }
    @Override
    public double setJarakTempuh(double jarakTempuh) {
        // TODO Auto-generated method stub
        this.jarakTempuh = jarakTempuh ;
        return jarakTempuh;
    }
    @Override
    public void getJarakTempuh() {
        // TODO Auto-generated method stub
        System.out.println("jarak tempuh : " + jarakTempuh + " km");
        
    }


    
    
}