package obiektowka.enumerable;

public enum Coffee {
    LATTE(10, Roast.BLONDE),
    ESPRESSO(0, Roast.DARK),
    AMERICANO(5, Roast.MEDIUM);

    private int milkLevel;
    private Roast roastLevel;

    Coffee(int milkLevel, Roast roastLevel){
        this.milkLevel = milkLevel;
        this.roastLevel = roastLevel;
    }

    public int getMilkLevel() {
        return milkLevel;
    }

    public void setMilkLevel(int milkLevel) {
        if(milkLevel > 0 && milkLevel <=10 ){
        this.milkLevel = milkLevel;
        }
    }

    public Roast getRoastLevel() {
        return roastLevel;
    }

    public void setRoastLevel(Roast roastLevel) {
        this.roastLevel = roastLevel;
    }
}

enum Roast{
    DARK,
    MEDIUM,
    BLONDE
}