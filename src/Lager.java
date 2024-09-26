import java.util.ArrayList;

public class Lager {
ArrayList<Kiste> lager = new ArrayList<Kiste>();


    public Lager() {
        this.lager = new ArrayList<Kiste>();
    }

    public void hinzufügen(Kiste kiste){
        lager.add(kiste);
    }

    public void alsListeAusgeben(){
        for(Kiste kiste : lager){

            System.out.println("-----------------------------------------------------------------");
            kiste.anzeigen();
        }
    }
}
