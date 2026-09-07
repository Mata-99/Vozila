import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){

    List<Vozila> vozila = new ArrayList<>();

    vozila.add(new Automobil("BMW", 4 ));
     vozila.add(new Kamion("Scania", 10000));
    vozila.add(new Motocikl("Kawasaki", 600));


        for(Vozila v : vozila){
            System.out.println(v);
        }
        Collections.sort(vozila);

    }
    }

