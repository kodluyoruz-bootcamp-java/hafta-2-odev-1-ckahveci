package com.hafta2_odev;

public class Phone {

    private String modelAdi;
    private String IMEI;
    private String version;
    private long bellekKapasitesi;
    private float ekranBoyutu;
    private Keyboard keyboard;


    public void read(Keyboard keyboard) {
        keyboard.read();
    }


    public void makeCall() {
        System.out.println(" arama yapabilir.");
    }

    public void sendMessage() {
        System.out.println(" SMS gonderebilir. ");
    }

    public String getModelAdi() {
        return modelAdi;
    }

    public void setModelAdi(String modelAdi) {
        this.modelAdi = modelAdi;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public long getBellekKapasitesi() {
        return bellekKapasitesi;
    }

    public void setBellekKapasitesi(long bellekKapasitesi) {
        this.bellekKapasitesi = bellekKapasitesi;
    }

    public float getEkranBoyutu() {
        return ekranBoyutu;
    }

    public void setEkranBoyutu(float ekranBoyutu) {
        this.ekranBoyutu = ekranBoyutu;
    }


}
