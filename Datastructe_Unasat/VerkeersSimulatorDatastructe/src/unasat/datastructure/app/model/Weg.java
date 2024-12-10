package VerkeersSimulatorDatastructe.src.unasat.datastructure.app.model;

public class Weg {
    private int id;
    private String naam;

    public Weg(int id, String naam) {
        this.id = id;
        this.naam = naam;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public static final Weg[] ALLE_WEGEN = {
            new Weg(1, "Noordzijde"),
            new Weg(2, "Zuidzijde"),
            new Weg(3, "Oostzijde"),
            new Weg(4, "Westzijde")
    };
}
