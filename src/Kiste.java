public abstract class Kiste {

    private String beschriftung;

    private String id;

    private double kg;


    public Kiste(String beschriftung, double kg, String id) {
        this.beschriftung = beschriftung;
        this.kg = kg;
        this.id = id;
    }

    public String getBeschriftung() {
        return beschriftung;
    }

    public void setBeschriftung(String beschriftung) {
        if(beschriftung==null){
            System.out.println("Bitte eintragen!");
        }
        this.beschriftung = beschriftung;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        if(kg<0){
            System.out.println("Bitte eintragen!");
        }

        this.kg = kg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id==null){
            System.out.println("Bitte eintragen!");
        }
        this.id = id;
    }




    public void anzeigen() {
        System.out.println("Holzkiste{" +
                "id='" + id + '\'' +
                '}');
    }
}
