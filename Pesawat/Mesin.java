public class Mesin{
    double kecepatanMesin ;
    int jarakTempuh ;
    
    void Mesin(double kecepatanMesin , int jarakTempuh){
        this.kecepatanMesin = kecepatanMesin ;
        this.jarakTempuh = jarakTempuh ;
        System.out.println("kecepatan mesin adalah = " + kecepatanMesin+"/km ");
        System.out.println("jarak tempuh adalah = " +jarakTempuh+ " km");

    }

}