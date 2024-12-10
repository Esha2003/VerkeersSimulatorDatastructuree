package VerkeersSimulatorDatastructe.src.unasat.datastructure.app.handler;

import VerkeersSimulatorDatastructe.src.unasat.datastructure.app.datastructures.PrioriteitsLijst;
import VerkeersSimulatorDatastructe.src.unasat.datastructure.app.datastructures.Stapel;
import VerkeersSimulatorDatastructe.src.unasat.datastructure.app.datastructures.Wachtrij;
import VerkeersSimulatorDatastructe.src.unasat.datastructure.app.model.Voertuig;

public class VoertuigHandler {
    private Stapel voertuigenStack;

    public VoertuigHandler(Stapel voertuigenStack) {
        this.voertuigenStack = voertuigenStack;
    }

    public void verwerkSpecialeVoertuigen(PrioriteitsLijst specialeVoertuigenQueue) {
        System.out.println("Speciale voertuigen krijgen voorrang");
        while (!specialeVoertuigenQueue.isLeeg()) {
            Voertuig voertuig = specialeVoertuigenQueue.verwijderen();
            voertuigenStack.toevoegen(voertuig);
            System.out.println("Speciaal voertuig " + voertuig.getVoertuigNaam() + " met kenteken " + voertuig.getRegistratieNummer() + " rijdt door.");
        }
        System.out.println();
    }

    public void laatVoertuigDoorRijden(Wachtrij voertuigenQueue) {
        Voertuig voertuig = voertuigenQueue.verwijderen();
        System.out.println(voertuig.getVoertuigNaam() + " met kenteken " + voertuig.getRegistratieNummer() + " rijdt door.");
        voertuigenStack.toevoegen(voertuig);
    }



    public void voerReversePlaybackUit() {
        System.out.println("Voertuigen keren terug naar hun oorspronkelijke posities");
        while (!voertuigenStack.isLeeg()) {
            Voertuig voertuig = voertuigenStack.verwijderen();
            String naam = voertuig.getVoertuigNaam() != null ? voertuig.getVoertuigNaam() : "Onbekend voertuig";
            String kenteken = voertuig.getRegistratieNummer() != null ? voertuig.getRegistratieNummer() : "Onbekend kenteken";
            String wegNaam = voertuig.getWeg() != null ? voertuig.getWeg().getNaam() : "Onbekende weg";
            System.out.println(naam + " met kenteken " + kenteken + " keert terug naar " + wegNaam);
        }
    }
}
