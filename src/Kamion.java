public class Kamion extends Vozila{

    int nosivostKamiona;

    public Kamion (String naziv,  int nosivostKamiona){
        super(naziv);
        this.nosivostKamiona = nosivostKamiona;
    }

    @Override
    int getBrzina() {
        return nosivostKamiona / 1000;
    }

    @Override
    int getCijena() {
        return nosivostKamiona * 10 + 350;
    }

    @Override
    public int compareTo(Vozila o) {
        return Integer.compare(this.getCijena(),o.getCijena());
    }
}
