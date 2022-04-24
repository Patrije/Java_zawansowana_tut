package obiektowka.interfejsy;

public class Radio extends UrzadzenieElektroniczne implements Soundable{

    private String zakresCzestotliwosci;

    public Radio(double poborMocy, String instrukcjaObslugi) {
        super(poborMocy, instrukcjaObslugi);
    }

    public Radio(double poborMocy, String instrukcjaObslugi, String zakresCzestotliwosci) {
        super(poborMocy, instrukcjaObslugi);
        this.zakresCzestotliwosci = zakresCzestotliwosci;
    }

    @Override
    public void sound() {
        System.out.println("Dzwiek z radia: trzeszczenie");
    }

    public void wyswietlInfoORadiu(){
        System.out.println(zakresCzestotliwosci + " " + getPoborMocy() + " "+ getInstrukcjaObslugi());
    }


}
