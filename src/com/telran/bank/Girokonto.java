package com.telran.bank;

import java.util.ArrayList;

public class Girokonto extends Konto{

    // =500???
   double kreditrahmen;

    public Girokonto(Person inhaber) {
        super(inhaber);
    }

    @Override
    public String toString() {
        return "Girokonto{" +
                "kreditrahmen=" + kreditrahmen +
                '}';
    }

    public double getKreditrahmen() {
        return kreditrahmen;
    }

    public void setKreditrahmen(double kreditrahmen) {
        this.kreditrahmen = kreditrahmen;
    }

    @Override
    public String kontoAuszug() {
        return null;
    }

}
