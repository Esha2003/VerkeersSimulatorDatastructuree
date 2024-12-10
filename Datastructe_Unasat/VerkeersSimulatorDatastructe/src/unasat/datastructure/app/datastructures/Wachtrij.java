package VerkeersSimulatorDatastructe.src.unasat.datastructure.app.datastructures;


import VerkeersSimulatorDatastructe.src.unasat.datastructure.app.model.Voertuig;

public class Wachtrij {

    private class Knop {
        Voertuig data;
        Knop volgende;

        Knop(Voertuig voertuig) {
            this.data = voertuig;
        }
    }

    private Knop begin, einde;
    private int grootte;

    public Wachtrij() {
        begin = null;
        einde = null;
        grootte = 0;
    }

    public void toevoegen(Voertuig voertuig) {
        Knop nieuweKnop = new Knop(voertuig);
        if (isLeeg()) {
            begin = nieuweKnop;
        } else {
            einde.volgende = nieuweKnop;
        }
        einde = nieuweKnop;
        grootte++;
    }

    public Voertuig verwijderen() {
        if (isLeeg()) return null;

        Voertuig voertuig = begin.data;
        begin = begin.volgende;
        if (begin == null) {
            einde = null;
        }
        grootte--;
        return voertuig;
    }

    public int getnItems() {
        return grootte;
    }

    public boolean isLeeg() {
        return grootte == 0;
    }
}
