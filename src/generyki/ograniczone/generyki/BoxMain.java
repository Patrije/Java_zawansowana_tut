package generyki.ograniczone.generyki;

import generyki.box.zadanie.Grape;

public class BoxMain {
    public static void main(String[] args) {
        Barbie barbie = new Barbie("Kleo", 6);
        TeddyBear teddyBear = new TeddyBear("Stefan", 10);
        Grape grape = new Grape("red");
        Box<Toy> barbieBox = new Box<>(teddyBear);
        barbieBox.play();
    }
}
