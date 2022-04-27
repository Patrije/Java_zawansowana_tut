package generyki.shop.zadanie;

public class ShoppingListMain {
    public static void main(String[] args) {
        Bread bread = new Bread(34.6);
        Milk milk = new Milk(10.0);
        ShoppingList<ListItem> shoppingList = new ShoppingList<>(new ListItem[]{bread, milk, milk});
        System.out.println("cena za wszystkjo to: " +shoppingList.countPrice());
    }
}
