package VerkeersSimulatorDatastructe.src.unasat.datastructure.app.kentekenplaat.generator;

public class KentekenPlaatGenerator {

    // Methode om speciale kentekenplaten te genereren
    public static String generateSpecialeKenteken(String prefix, int nummer) {
        return prefix + "-Suriname " + String.format("%02d-%02d", nummer, nummer);
    }
}
