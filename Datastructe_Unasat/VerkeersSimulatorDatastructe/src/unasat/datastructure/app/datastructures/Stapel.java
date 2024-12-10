package VerkeersSimulatorDatastructe.src.unasat.datastructure.app.datastructures;


import VerkeersSimulatorDatastructe.src.unasat.datastructure.app.model.Voertuig;

public class Stapel {

    private class Knop {
        Voertuig data;
        Knop volgende;

        Knop(Voertuig voertuig) {
            this.data = voertuig;
        }
    }

    private Knop boven;
    private int grootte;

    public Stapel() {
        boven = null;
        grootte = 0;
    }

    public void toevoegen(Voertuig voertuig) {
        Knop nieuweKnop = new Knop(voertuig);
        nieuweKnop.volgende = boven;
        boven = nieuweKnop;
        grootte++;
    }

    public Voertuig verwijderen() {
        if (boven == null) return null;

        Voertuig voertuig = boven.data;
        boven = boven.volgende;
        grootte--;
        return voertuig;
    }

    public boolean isLeeg() {
        return grootte == 0;
    }
}
