
public class Automobil extends Vozila{
    private int brojVrata;

    public Automobil(String naziv, int brojVrata){
        super(naziv);
        this.brojVrata = brojVrata;
    }

    @Override
    int getBrzina() {
        return 30 + brojVrata *4 ;
    }

    @Override
    int getCijena() {
        return 10000 + brojVrata + 350;
    }

    @Override
    public int compareTo(Vozila o) {
        return Integer.compareTo(this.getCijena(),o.getCijena());
    }
}
