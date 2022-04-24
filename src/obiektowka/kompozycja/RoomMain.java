package obiektowka.kompozycja;

public class RoomMain {

    public static void main(String[] args) {

        Room.TV tv = new Room.TV(34);
        Room.Bed bed = new Room.Bed(5);

        Room room = new Room(bed, tv);
        room.idzSpaj();
        room.ogladajTv();
    }
}
