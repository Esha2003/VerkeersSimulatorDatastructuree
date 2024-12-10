package VerkeersSimulatorDatastructe.src.unasat.datastructure.app.datastructures;

import VerkeersSimulatorDatastructe.src.unasat.datastructure.app.model.Voertuig;

public class PrioriteitsLijst {

    private class Knop {
        Voertuig data;
        int prioriteit;
        Knop volgende;

        Knop(Voertuig voertuig) {
            this.data = voertuig;
            this.prioriteit = voertuig.getPrioriteit();
        }
    }

    private Knop kop;
    private int grootte;

    public PrioriteitsLijst() {
        kop = null;
        grootte = 0;
    }

    public void toevoegen(Voertuig voertuig) {
        Knop nieuweKnop = new Knop(voertuig);
        nieuweKnop.volgende = kop;
        kop = nieuweKnop;
        grootte++;
    }

    public Voertuig verwijderen() {
        if (kop == null) return null;

        Voertuig voertuig = kop.data;
        kop = kop.volgende;
        grootte--;
        return voertuig;
    }

    public boolean isLeeg() {
        return grootte == 0;
    }
}
