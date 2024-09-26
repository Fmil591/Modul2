public class Main {
    public static void main(String[] args) {

        Plastikbox plastikbox = new Plastikbox("Karotten",1,"1","Normal");
        Holzkiste holzkiste = new Holzkiste("Holz",49,"2","Eiche");

        Lager lager = new Lager();

        lager.hinzufügen(plastikbox);
        lager.hinzufügen(holzkiste);
        lager.alsListeAusgeben();



    }
}