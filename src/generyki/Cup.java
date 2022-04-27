package generyki;

public class Cup<T>{

    private T liquid;

    public Cup(T liquid) {
        this.liquid = liquid;
    }

    public void wyswietlCoPije(){
        System.out.println("pije wlasnie "+ liquid);
    }

    public <V> String stworzInfoOFilizance(V liquid) {
        return liquid + " " +this.liquid.toString();
    }

}
