package VerkeersSimulatorDatastructe.src.unasat.datastructure.app.controller;

import VerkeersSimulatorDatastructe.src.unasat.datastructure.app.datastructures.Wachtrij;

public class StoplichtController {
    public boolean alleWegenLeeg(Wachtrij noordQueue, Wachtrij zuidQueue, Wachtrij oostQueue, Wachtrij westQueue) {
        return noordQueue.isLeeg() && zuidQueue.isLeeg() && oostQueue.isLeeg() && westQueue.isLeeg();
    }

    public void schakelStoplichtVoorWeg(int wegId, Wachtrij noordQueue, Wachtrij zuidQueue, Wachtrij oostQueue, Wachtrij westQueue) {
        switch (wegId) {
            case 1:
                activeerSensorVoorWeg(noordQueue, "Noord");
                break;
            case 2:
                activeerSensorVoorWeg(zuidQueue, "Zuid");
                break;
            case 3:
                activeerSensorVoorWeg(oostQueue, "Oost");
                break;
            case 4:
                activeerSensorVoorWeg(westQueue, "West");
                break;
            default:
                break;
        }
        System.out.println();
    }

    private void activeerSensorVoorWeg(Wachtrij voertuigenQueue, String wegNaam) {
        System.out.println("Sensor voor " + wegNaam + " wordt geactiveerd");
        if (!voertuigenQueue.isLeeg()) {
            System.out.println("Stoplicht " + wegNaam + " springt op groen");
            if (voertuigenQueue.getnItems() < 5) {
                while (!voertuigenQueue.isLeeg()) {
                    voertuigenQueue.verwijderen();
                }
            } else {
                for (int i = 0; i < 5; i++) {
                    if (!voertuigenQueue.isLeeg()) {
                        voertuigenQueue.verwijderen();
                    } else {
                        break;
                    }
                }
            }
        } else {
            System.out.println(wegNaam + " is leeg");
        }
    }

    public void schakeerStoplicht(int wegId) {
    }
}
