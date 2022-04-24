package obiektowka.interfejsy;

public class UrzadzenieElektroniczne {

    private double poborMocy;
    private String instrukcjaObslugi;

    public UrzadzenieElektroniczne(double poborMocy, String instrukcjaObslugi) {
        this.poborMocy = poborMocy;
        this.instrukcjaObslugi = instrukcjaObslugi;
    }

    public double getPoborMocy() {
        return poborMocy;
    }

    public void setPoborMocy(double poborMocy) {
        this.poborMocy = poborMocy;
    }

    public String getInstrukcjaObslugi() {
        return instrukcjaObslugi;
    }

    public void setInstrukcjaObslugi(String instrukcjaObslugi) {
        this.instrukcjaObslugi = instrukcjaObslugi;
    }
}
