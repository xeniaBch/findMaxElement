package com.telran.bank;

//Sorry, I had no time to make it to the end
public abstract class Konto {
    private int nummer;
    private Person inhaber;
    protected double saldo;
    private static int naechsteNummer;

    public Konto(Person inhaber) {
        this.inhaber = inhaber;
    }

    public int getNummer() {
        return nummer;
    }

    public Person getInhaber() {
        return inhaber;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Konto{" +
                "nummer=" + nummer +
                ", inhaber=" + inhaber +
                ", saldo=" + saldo +
                ", naechsteNummer=" + naechsteNummer +
                '}';
    }

    public void einzahlen(double betrag){
    }

    public boolean auszahlen(double betrag){
        return false;
    }

    public abstract String kontoAuszug();
}
