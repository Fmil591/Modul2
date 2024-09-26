public class Holzkiste extends Kiste{
    private String Holzart;

    public Holzkiste(String beschriftung, double kg, String id, String holzart) {
        super(beschriftung, kg, id);
        this.Holzart = holzart;
    }

    public String getHolzart() {
        return Holzart;
    }

    public void setHolzart(String holzart) {

        if(holzart==null){
            System.out.println("Bitte eintragen!");
        }
        this.Holzart = holzart;
    }




    public void anzeigen() {
        System.out.println("Holzkiste{" +
                "Holzart='" + Holzart + '\'' +
                '}');
    }
}
