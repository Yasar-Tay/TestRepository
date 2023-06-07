package backend;

public abstract class Kahve {
    protected String cesit;
    protected boolean sutlu;
    protected int seker;
    protected String boy;
    protected int fiyat;

    public String getCesit() {
        return cesit;
    }

    public void setCesit(String cesit) {
        this.cesit = cesit;
    }

    public boolean isSutlu() {
        return sutlu;
    }

    public void setSutlu(boolean sutlu) {
        this.sutlu = sutlu;
    }

    public int getSeker() {
        return seker;
    }

    public void setSeker(int seker) {
        this.seker = seker;
    }

    public String getBoy() {
        return boy;
    }

    public void setBoy(String boy) {
        this.boy = boy;
    }

    public int getFiyat() {
        return fiyat;
    }

    public abstract void setFiyat();

    public abstract String ikramEkle();

    /* public void setFiyat() {
        if (cesit.equalsIgnoreCase("türk kahvesi")) {
            switch (boy) {
                case "küçük boy":
                    fiyat = 25;
                    break;
                case "orta boy":
                    fiyat = 35;
                    break;
                case "büyük boy":
                    fiyat = 45;
                    break;
            }
        } else if (cesit.equalsIgnoreCase("filtre kahve")) {
            switch (boy) {
                case "küçük boy":
                    fiyat = 40;
                    break;
                case "orta boy":
                    fiyat = 50;
                    break;
                case "büyük boy":
                    fiyat = 60;
                    break;
            }
        } else {
            switch (boy) {
                case "küçük boy":
                    fiyat = 90;
                    break;
                case "orta boy":
                    fiyat = 100;
                    break;
                case "büyük boy":
                    fiyat = 110;
                    break;
            }
        }
    }

    public String ikramEkle(){
        String ikram = null;

        if (cesit.equalsIgnoreCase("türk kahvesi"))
            ikram = "Lokum";
        else if (cesit.equalsIgnoreCase("filtre kahve"))
            ikram = "Çikolata kaşık";
        else
            ikram = "Badem Şekeri";

        return ikram;
    } */
}

