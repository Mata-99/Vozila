public abstract class Vozila implements Comparable<Vozila> {

    private String naziv;

    public   Vozila(String naziv){
        this.naziv = naziv;

    }
    abstract int getBrzina();
    abstract int getCijena();

    @Override
    public String toString(){
        return naziv + " - brzina: " + getBrzina() + " km/h - cijena: " + getCijena() + " €";
    }

    }
