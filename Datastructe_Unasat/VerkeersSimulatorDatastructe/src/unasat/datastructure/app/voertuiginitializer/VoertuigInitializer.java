package VerkeersSimulatorDatastructe.src.unasat.datastructure.app.voertuiginitializer;


import VerkeersSimulatorDatastructe.src.unasat.datastructure.app.model.Voertuig;
import VerkeersSimulatorDatastructe.src.unasat.datastructure.app.model.Weg;
import java.util.ArrayList;
import java.util.List;
import static VerkeersSimulatorDatastructe.src.unasat.datastructure.app.kentekenplaat.generator.KentekenPlaatGenerator.generateSpecialeKenteken;

public class VoertuigInitializer {

    // Arrays
    public Voertuig[] initVoertuigenNoordArray() {
        Weg noordzijde = Weg.ALLE_WEGEN[0];
        return new Voertuig[]{
                new Voertuig(noordzijde, 1, generateSpecialeKenteken("PA", 89)),
                new Voertuig(noordzijde, 2, generateSpecialeKenteken("PA", 90)),
                new Voertuig(noordzijde, 3, "Speciaal", "Ambulance met sirene", 3, generateSpecialeKenteken("AM", 99)),
                new Voertuig(noordzijde, 4, generateSpecialeKenteken("PA", 91))
        };
    }

    public Voertuig[] initVoertuigenZuidArray() {
        Weg zuidzijde = Weg.ALLE_WEGEN[1];
        return new Voertuig[]{
                new Voertuig(zuidzijde, 1, generateSpecialeKenteken("PA", 92)),
                new Voertuig(zuidzijde, 2, generateSpecialeKenteken("PA", 93)),
                new Voertuig(zuidzijde, 3, generateSpecialeKenteken("PA", 94)),
                new Voertuig(zuidzijde, 4, generateSpecialeKenteken("PA", 95)),
                new Voertuig(zuidzijde, 5, generateSpecialeKenteken("PA", 96)),
                new Voertuig(zuidzijde, 6, generateSpecialeKenteken("PA", 97)),
                new Voertuig(zuidzijde, 7, generateSpecialeKenteken("PA", 98)),
                new Voertuig(zuidzijde, 8, generateSpecialeKenteken("PA", 99)),
                new Voertuig(zuidzijde, 9, generateSpecialeKenteken("PA", 100)),
                new Voertuig(zuidzijde, 10, generateSpecialeKenteken("PA", 101)),
                new Voertuig(zuidzijde, 11, generateSpecialeKenteken("PA", 102)),
                new Voertuig(zuidzijde, 12, generateSpecialeKenteken("PA", 103)),
                new Voertuig(zuidzijde, 13, generateSpecialeKenteken("PA", 104)),
                new Voertuig(zuidzijde, 14, generateSpecialeKenteken("PA", 105)),
                new Voertuig(zuidzijde, 15, generateSpecialeKenteken("PA", 106)),
                new Voertuig(zuidzijde, 16, generateSpecialeKenteken("PA", 107)),
                new Voertuig(zuidzijde, 17, "Speciaal", "Brandweer met sirene", 2, generateSpecialeKenteken("FB", 90)),
                new Voertuig(zuidzijde, 18, generateSpecialeKenteken("PA", 108))
        };
    }

    public Voertuig[] initVoertuigenOostArray() {
        Weg oostzijde = Weg.ALLE_WEGEN[2];
        return new Voertuig[]{
                new Voertuig(oostzijde, 1, generateSpecialeKenteken("PA", 109)),
                new Voertuig(oostzijde, 2, generateSpecialeKenteken("PA", 110)),
                new Voertuig(oostzijde, 3, generateSpecialeKenteken("PA", 111)),
                new Voertuig(oostzijde, 4, generateSpecialeKenteken("PA", 112)),
                new Voertuig(oostzijde, 5, generateSpecialeKenteken("PA", 113))
        };
    }

    public Voertuig[] initVoertuigenWestArray() {
        Weg westzijde = Weg.ALLE_WEGEN[3];
        return new Voertuig[]{
                new Voertuig(westzijde, 1, generateSpecialeKenteken("PA", 114)),
                new Voertuig(westzijde, 2, generateSpecialeKenteken("PA", 115)),
                new Voertuig(westzijde, 3, generateSpecialeKenteken("PA", 116)),
                new Voertuig(westzijde, 4, generateSpecialeKenteken("PA", 117)),
                new Voertuig(westzijde, 5, generateSpecialeKenteken("PA", 118)),
                new Voertuig(westzijde, 6, generateSpecialeKenteken("PA", 119)),
                new Voertuig(westzijde, 7, generateSpecialeKenteken("PA", 120)),
                new Voertuig(westzijde, 8, generateSpecialeKenteken("PA", 121)),
                new Voertuig(westzijde, 9, "Speciaal", "Politie met sirene", 1, generateSpecialeKenteken("PS", 91)),
                new Voertuig(westzijde, 10, generateSpecialeKenteken("PA", 122)),
                new Voertuig(westzijde, 11, generateSpecialeKenteken("PA", 123)),
                new Voertuig(westzijde, 12, generateSpecialeKenteken("PA", 124)),
                new Voertuig(westzijde, 13, generateSpecialeKenteken("PA", 125)),
                new Voertuig(westzijde, 14, generateSpecialeKenteken("PA", 126))
        };
    }

    // ArrayLists
    public List<Voertuig> initVoertuigenNoordList() {
        Weg noordzijde = Weg.ALLE_WEGEN[0];
        List<Voertuig> voertuigenNoordList = new ArrayList<>();
        voertuigenNoordList.add(new Voertuig(noordzijde, 1, generateSpecialeKenteken("PA", 89)));
        voertuigenNoordList.add(new Voertuig(noordzijde, 2, generateSpecialeKenteken("PA", 90)));
        voertuigenNoordList.add(new Voertuig(noordzijde, 3, "Speciaal", "Ambulance met sirene", 3, generateSpecialeKenteken("AM", 99)));
        voertuigenNoordList.add(new Voertuig(noordzijde, 4, generateSpecialeKenteken("PA", 91)));
        return voertuigenNoordList;
    }

    public List<Voertuig> initVoertuigenZuidList() {
        Weg zuidzijde = Weg.ALLE_WEGEN[1];
        List<Voertuig> voertuigenZuidList = new ArrayList<>();
        voertuigenZuidList.add(new Voertuig(zuidzijde, 1, generateSpecialeKenteken("PA", 92)));
        voertuigenZuidList.add(new Voertuig(zuidzijde, 2, generateSpecialeKenteken("PA", 93)));
        voertuigenZuidList.add(new Voertuig(zuidzijde, 3, generateSpecialeKenteken("PA", 94)));
        voertuigenZuidList.add(new Voertuig(zuidzijde, 4, generateSpecialeKenteken("PA", 95)));
        voertuigenZuidList.add(new Voertuig(zuidzijde, 5, generateSpecialeKenteken("PA", 96)));
        voertuigenZuidList.add(new Voertuig(zuidzijde, 6, generateSpecialeKenteken("PA", 97)));
        voertuigenZuidList.add(new Voertuig(zuidzijde, 7, generateSpecialeKenteken("PA", 98)));
        voertuigenZuidList.add(new Voertuig(zuidzijde, 8, generateSpecialeKenteken("PA", 99)));
        voertuigenZuidList.add(new Voertuig(zuidzijde, 9, generateSpecialeKenteken("PA", 100)));
        voertuigenZuidList.add(new Voertuig(zuidzijde, 10, generateSpecialeKenteken("PA", 101)));
        voertuigenZuidList.add(new Voertuig(zuidzijde, 11, generateSpecialeKenteken("PA", 102)));
        voertuigenZuidList.add(new Voertuig(zuidzijde, 12, generateSpecialeKenteken("PA", 103)));
        voertuigenZuidList.add(new Voertuig(zuidzijde, 13, generateSpecialeKenteken("PA", 104)));
        voertuigenZuidList.add(new Voertuig(zuidzijde, 14, generateSpecialeKenteken("PA", 105)));
        voertuigenZuidList.add(new Voertuig(zuidzijde, 15, generateSpecialeKenteken("PA", 106)));
        return voertuigenZuidList;
    }

}
