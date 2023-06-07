package backend;

public class Cappuccino extends Kahve{
    @Override
    public void setFiyat() {
        switch (boy) {
            case "küçük boy":
                fiyat = 100;
                break;
            case "orta boy":
                fiyat = 150;
                break;
            case "büyük boy":
                fiyat = 200;
                break;
            case "battal boy":
                fiyat = 400;
                break;
        }
    }

    @Override
    public String ikramEkle() {
        return "Su ve cikolata";
    }
}
