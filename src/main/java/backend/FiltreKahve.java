package backend;

public class FiltreKahve extends Kahve{
    @Override
    public void setFiyat() {
        switch (boy) {
            case "küçük boy":
                fiyat = 40;
                break;
            case "orta boy":
                fiyat = 50;
                break;
            case "büyük boy":
                fiyat = 80;
                break;
        }
    }

    @Override
    public String ikramEkle() {
        return "Çikolata kaşık";
    }
}
