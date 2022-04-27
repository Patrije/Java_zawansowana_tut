package generyki.shop.zadanie;

public class ShoppingList <T extends ListItem>{

    private T[] listItems;

    public ShoppingList(T[] listItems) {
        this.listItems = listItems;
    }

    public double countPrice(){
        double price =0;
        for (ListItem item:listItems) {
        price+=item.price;
        }
        return price;
    }
}
