public class Plastikbox extends Kiste{

    private String plastikart;

    public Plastikbox(String beschriftung, double kg, String id, String plastikart) {
        super(beschriftung, kg, id);
        this.plastikart=plastikart;
    }

    public String getPlastikart() {
        return plastikart;
    }

    public void setPlastikart(String plastikart) {
        if(plastikart==null){
            System.out.println("Bitte eintragen!");
        }

        this.plastikart = plastikart;
    }


    public void anzeigen() {
        System.out.println("Plastikbox{" +
                "plastikart='" + plastikart + '\'' +
                '}');
    }
}
