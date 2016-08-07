package Transporte;

public class Taxi extends Carro{
    
    public String placa;
    public boolean gps = false;
    public boolean rampa = false;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public boolean isRampa() {
        return rampa;
    }

    public void setRampa(boolean rampa) {
        this.rampa = rampa;
    }    
}

