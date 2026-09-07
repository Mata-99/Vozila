public class Motocikl extends Vozila{
    int zapreminaMotora;

    public Motocikl(String naziv,  int zapreminaMotora){
        super(naziv);
        this.zapreminaMotora = zapreminaMotora;
    }

    @Override
    int getBrzina() {
        return  200 + zapreminaMotora / 30;
    }

    @Override
    int getCijena() {
        return zapreminaMotora * 8;
    }

    @Override
    public int compareTo(Vozila o) {
        return this.getCijena().compareTo(o.cijena());
    }
}
