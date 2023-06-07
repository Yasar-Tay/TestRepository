package backend;

public class TurkKahvesi extends Kahve {

    @Override
    public void setFiyat() {
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
    }

    @Override
    public String ikramEkle() {
        return "Fındıklı Narlı Lokum";
    }

}