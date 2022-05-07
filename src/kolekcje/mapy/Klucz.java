package kolekcje.mapy;

import java.util.Objects;

public class Klucz {

    private String part1;
    private Integer part2;

    public Klucz(String part1, Integer part2) {
        this.part1 = part1;
        this.part2 = part2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klucz klucz = (Klucz) o;
        return Objects.equals(part1, klucz.part1) && Objects.equals(part2, klucz.part2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(part1, part2);
    }

    @Override
    public String toString() {
        return "Klucz{" +
                "part1='" + part1 + '\'' +
                ", part2=" + part2 +
                '}';
    }
}
