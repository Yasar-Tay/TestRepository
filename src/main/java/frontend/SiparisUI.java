package frontend;

import backend.*;

import java.util.Scanner;

public class SiparisUI {
    Scanner scanner = new Scanner(System.in);
    private Kahve kahve;

    public void siparisAl() {
        kahveSec();
        sutSor();
        sekerSor();
        boySor();

        kahve.setFiyat();

        System.out.println("************************************");
        System.out.printf("%s %s hazır.\n", kahve.getBoy(), kahve.getCesit());
        System.out.printf("Borcunuz %d TL efendim.\n", kahve.getFiyat());
        System.out.printf("%s müessesemizin ikramıdır\n", kahve.ikramEkle());
        System.out.println("Afiyet olsun.");
        System.out.println("************************************");
    }

    private void kahveSec() {
        String hangiKahve;

        boolean flag = true;
        do {
            System.out.println("v0.0.2 from serho-23:\nHangi Kahveyi istersiniz? \n1.Türk kahvesi \n2.Filtre Kahve \n3.Espresso\n4.Cappuccino\n5.White chocolate \n-----------");
            System.out.print("Seçiminiz: ");
            hangiKahve = scanner.nextLine().toLowerCase().trim();

            switch (hangiKahve) {
                case "türk kahvesi":
                    kahve = new TurkKahvesi();
                    flag = false;
                    break;
                case "filtre kahve":
                    kahve = new FiltreKahve();
                    flag = false;
                    break;
                case "espresso":
                    kahve = new Espresso();
                    flag = false;
                    break;
                case "cappuccino":
                    kahve = new Cappuccino();
                    flag = false;
                    break;

                default:
                    System.out.println("\n----------------\nHatalı giriş yaptınız.\n----------------\n");
            }
        } while (flag);

        System.out.println("\n----------------");
        System.out.println(hangiKahve + " hazırlanıyor");
        System.out.println("----------------\n");

        kahve.setCesit(hangiKahve);

    }

    private void sutSor() {
        boolean flag = true;

        do {
            System.out.println("Süt eklememizi ister misiniz ? (Evet / Hayır)");
            String sut = scanner.next();

            if (sut.equalsIgnoreCase("Evet")) {
                System.out.println("\n----------------\nSüt ekleniyor.\n----------------\n");
                kahve.setSutlu(true);
                flag = false;
            } else if (sut.equalsIgnoreCase("Hayır")) {
                System.out.println("\n----------------\nSut eklenmiyor.\n----------------\n");
                flag = false;
            } else {
                System.out.println("\n----------------\nHatalı giriş yaptınız.\n----------------\n");
            }
        } while (flag);

    }

    private void sekerSor() {
        boolean flag = true;

        do {
            System.out.println("Şeker ister misiniz? (Evet / Hayır)");

            String seker = scanner.next();
            if (seker.equalsIgnoreCase("evet")) {
                System.out.print("Kaç şeker : ");
                int kacSeker = scanner.nextInt();
                System.out.println("\n----------------\n" + kacSeker + " şeker ekleniyor\n----------------\n");
                kahve.setSeker(kacSeker);
                flag = false;
            } else if (seker.equalsIgnoreCase("hayır")) {
                System.out.println("\n----------------\nŞeker eklenmiyor.\n----------------\n");
                flag = false;
            } else {
                System.out.println("\n----------------\nHatalı giriş yaptınız.\n----------------\n");
            }

        } while (flag);

    }

    private void boySor() {
        scanner.nextLine(); //dummy
        boolean flag = true;

        do {
            System.out.println("Hangi boyutta olsun? (Büyük boy - Orta boy - Küçük boy)");
            String kahveBoyut = scanner.nextLine().toLowerCase().trim();

            switch (kahveBoyut) {
                case "büyük boy":
                case "orta boy":
                case "küçük boy":
                    System.out.println("\n----------------\nKahveniz " + kahveBoyut + " hazırlanıyor\n----------------\n");
                    kahve.setBoy(kahveBoyut);
                    flag = false;
                    break;
                default:
                    System.out.println("\n----------------\nHatalı giriş yaptınız.\n----------------\n");
            }

        } while (flag);
    }

}
