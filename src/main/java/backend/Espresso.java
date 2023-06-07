package backend;

public class Espresso extends Kahve{
    @Override
    public void setFiyat() {
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

    @Override
    public String ikramEkle() {
        return "Badem Şekeri";
    }
}
