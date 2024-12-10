package VerkeersSimulatorDatastructe.src.unasat.datastructure.app.model;


public class Voertuig {
    private Weg weg;
    private int idNummer;
    private String voertuigType;
    private String voertuigNaam;
    private String registratieNummer;
    private int prioriteit;

    public Voertuig(Weg weg, int idNummer, String registratieNummer) {
        this.weg = weg;
        this.idNummer = idNummer;
        this.voertuigNaam = "Voertuig" + idNummer;
        this.registratieNummer = registratieNummer;
    }

    public Voertuig(Weg weg, int idNummer, String voertuigType, String voertuigNaam, int prioriteit, String registratieNummer) {
        this.weg = weg;
        this.idNummer = idNummer;
        this.voertuigType = voertuigType;
        this.voertuigNaam = voertuigNaam;
        this.prioriteit = prioriteit;
        this.registratieNummer = registratieNummer;
    }

    public Weg getWeg() {
        return weg;
    }

    public void setWeg(Weg weg) {
        this.weg = weg;
    }

    public int getIdNummer() {
        return idNummer;
    }

    public void setIdNummer(int idNummer) {
        this.idNummer = idNummer;
    }

    public String getVoertuigType() {
        return voertuigType;
    }

    public void setVoertuigType(String voertuigType) {
        this.voertuigType = voertuigType;
    }

    public String getVoertuigNaam() {
        return voertuigNaam;
    }

    public void setVoertuigNaam(String voertuigNaam) {
        this.voertuigNaam = voertuigNaam;
    }

    public String getRegistratieNummer() {
        return registratieNummer;
    }

    public void setRegistratieNummer(String registratieNummer) {
        this.registratieNummer = registratieNummer;
    }

    public int getPrioriteit() {
        return prioriteit;
    }

    public void setPrioriteit(int prioriteit) {
        this.prioriteit = prioriteit;
    }
}
