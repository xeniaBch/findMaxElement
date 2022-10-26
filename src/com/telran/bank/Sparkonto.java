package com.telran.bank;

public class Sparkonto extends Konto{
    private static double zinssatz = 0.02;

    public Sparkonto(Person inhaber) {
        super(inhaber);
    }

    @Override
    public String kontoAuszug() {
        return null;
    }
}
