package com.telran.bank;

public class Sparkonto extends Konto{
    private double zinssatz;

    public Sparkonto(Person inhaber) {
        super(inhaber);
    }

    @Override
    public String kontoAuszug() {
        return null;
    }
}
