package obiektowka.kompozycja;

public class Room {

    Bed bed;
    TV tv;

    public Room(Bed bed, TV tv) {
        this.bed = bed;
        this.tv = tv;
    }

    public void idzSpaj(){
        bed.przygotujDoSpania();
        System.out.println("Spie ZZZzzz");
    }

    public void ogladajTv(){
        tv.wlaczWylacz();
        tv.ogladanieTv();
    }

    public static class Bed {
        private int miekkosc;
        private boolean czyPoslane = true;

        public Bed(int miekkosc) {
            this.miekkosc = miekkosc;
        }

        private void przygotujDoSpania(){
            czyPoslane = false;
        }
    }

    public static class TV {

        private int liczbaKanalow;
        private boolean czyWlaczony  = false;

        public TV(int liczbaKanalow) {
            this.liczbaKanalow = liczbaKanalow;
        }

        public void wlaczWylacz(){
            this.czyWlaczony = !czyWlaczony;
        }

        public void ogladanieTv(){
            System.out.println("leci film ");
        }

    }

}

