package generyki;

public class Tea {

    private String teaType;

    public Tea(String teaType) {
        this.teaType = teaType;
    }


    @Override
    public String toString() {
        return teaType;
    }
}
