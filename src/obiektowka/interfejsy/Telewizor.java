package obiektowka.interfejsy;

public class Telewizor extends UrzadzenieElektroniczne implements Soundable, Displayable{
    private double przekatnaEkranu;

    public Telewizor(double poborMocy, String instrukcjaObslugi) {
        super(poborMocy, instrukcjaObslugi);
    }

    public Telewizor(double poborMocy, String instrukcjaObslugi, double przekatnaEkranu) {
        super(poborMocy, instrukcjaObslugi);
        this.przekatnaEkranu = przekatnaEkranu;
    }

    @Override
    public void sound() {
        System.out.println("Telewizor gra");
    }

    public void wyswietlInformacje(){
        System.out.println(przekatnaEkranu + " "+getPoborMocy() + " "+getInstrukcjaObslugi());
    }

    @Override
    public void display() {
        System.out.println("Telewizor wyswietla bajke");
    }
}
