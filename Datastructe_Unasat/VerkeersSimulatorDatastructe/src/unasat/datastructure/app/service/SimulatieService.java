package VerkeersSimulatorDatastructe.src.unasat.datastructure.app.service;

import VerkeersSimulatorDatastructe.src.unasat.datastructure.app.controller.StoplichtController;
import VerkeersSimulatorDatastructe.src.unasat.datastructure.app.datastructures.PrioriteitsLijst;
import VerkeersSimulatorDatastructe.src.unasat.datastructure.app.datastructures.Stapel;
import VerkeersSimulatorDatastructe.src.unasat.datastructure.app.datastructures.Wachtrij;
import VerkeersSimulatorDatastructe.src.unasat.datastructure.app.handler.VoertuigHandler;
import VerkeersSimulatorDatastructe.src.unasat.datastructure.app.model.Voertuig;

import java.util.List;

import static VerkeersSimulatorDatastructe.src.unasat.datastructure.app.model.Weg.ALLE_WEGEN;

public class SimulatieService {
    private PrioriteitsLijst specialeVoertuigenQueue = new PrioriteitsLijst();
    private Wachtrij noordVoertuigenQueue = new Wachtrij();
    private Wachtrij zuidVoertuigenQueue = new Wachtrij();
    private Wachtrij oostVoertuigenQueue = new Wachtrij();
    private Wachtrij westVoertuigenQueue = new Wachtrij();

    private Stapel voertuigenStack = new Stapel();
    private StoplichtController stoplichtController = new StoplichtController();
    private VoertuigHandler voertuigHandler = new VoertuigHandler(voertuigenStack);

    public void sorteerVoertuigenOpPrioriteit(List<Voertuig> noordVoertuigen, List<Voertuig> zuidVoertuigen, List<Voertuig> oostVoertuigen, List<Voertuig> westVoertuigen) {
        plaatsVoertuigenInQueue(noordVoertuigen, noordVoertuigenQueue);
        plaatsVoertuigenInQueue(zuidVoertuigen, zuidVoertuigenQueue);
        plaatsVoertuigenInQueue(oostVoertuigen, oostVoertuigenQueue);
        plaatsVoertuigenInQueue(westVoertuigen, westVoertuigenQueue);

        startStoplichtCylus();
    }

    private void plaatsVoertuigenInQueue(List<Voertuig> voertuigen, Wachtrij queue) {
        for (Voertuig voertuig : voertuigen) {
            if ("Speciaal".equals(voertuig.getVoertuigType())) {
                specialeVoertuigenQueue.toevoegen(voertuig);
            } else {
                queue.toevoegen(voertuig);
            }
        }
    }

    private void startStoplichtCylus() {
        voertuigHandler.verwerkSpecialeVoertuigen(specialeVoertuigenQueue);

        int rondeTeller = 0;
        for (int wegIndex = 0; wegIndex < ALLE_WEGEN.length; wegIndex++) {
            if (alleWegenLeeg()) {
                System.out.println("Alle wegen zijn leeg.");
                System.out.println("Aantal rondes om alle voertuigen te laten rijden: " + Math.round(rondeTeller / 4));
                System.out.println();
                voertuigHandler.voerReversePlaybackUit();
                break;
            } else {
                int wegId = ALLE_WEGEN[wegIndex].getId();
                switch (wegId) {
                    case 1:
                        verwerkNormaleVoertuigen(noordVoertuigenQueue);
                        break;
                    case 2:
                        verwerkNormaleVoertuigen(zuidVoertuigenQueue);
                        break;
                    case 3:
                        verwerkNormaleVoertuigen(oostVoertuigenQueue);
                        break;
                    case 4:
                        verwerkNormaleVoertuigen(westVoertuigenQueue);
                        break;
                    default:
                        break;
                }
                schakelStoplichtVoorWeg(wegId);
                if (wegIndex == ALLE_WEGEN.length - 1) {
                    wegIndex = -1; // Terug naar het begin van de wegen
                }
            }
            rondeTeller++;
        }
    }

    private boolean alleWegenLeeg() {
        return noordVoertuigenQueue.isLeeg() && zuidVoertuigenQueue.isLeeg() && oostVoertuigenQueue.isLeeg() && westVoertuigenQueue.isLeeg();
    }

    private void verwerkNormaleVoertuigen(Wachtrij voertuigenQueue) {
        while (!voertuigenQueue.isLeeg()) {
            voertuigHandler.laatVoertuigDoorRijden(voertuigenQueue);
        }
    }

    private void schakelStoplichtVoorWeg(int wegId) {
        stoplichtController.schakeerStoplicht(wegId); // Veronderstelt dat de controller stoplichten schakelt
    }
}
