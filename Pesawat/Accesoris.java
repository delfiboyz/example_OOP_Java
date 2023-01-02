import java.io.WriteAbortedException;

public class Accesoris {
    String warnaSayap ;
    String warnaBody ;
    String weapon ;

    String setWarnaPesawat(String warnaSayap , String warnaBody){
        this.warnaSayap = warnaSayap ;
        this.warnaBody = warnaBody;
        return warnaBody + warnaSayap ;
        
    }


    void getWarnaPesawat(){
        
        System.out.println("warna sayap pesawat adalah " + warnaSayap);
        System.out.println("warna body pesawat adalah " + warnaBody);
    }



        

    public String setWeapon(String weapon){
        this.weapon = weapon ;

        return weapon; 

    }

    public void getWeapon(){
        System.out.println("jenis senjata adalah = " + weapon);

    }

    
    

    void nos(){
        System.out.println("pesawat ini menggunakan nos ");
    }


    

}
