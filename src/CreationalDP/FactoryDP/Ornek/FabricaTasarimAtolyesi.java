package CreationalDP.FactoryDP.Ornek;

public class FabricaTasarimAtolyesi {
    public static void main(String[] args) {

        Fabrika urun1=new Fabrika();
        urun1.evYap("villa").yap();
        urun1.evYap("gecekondu").yap();
        urun1.evYap("yali").yap();

        Ev ev1=urun1.evYap("villa");
        ev1.yap();
        Ev ev2=urun1.evYap("gecekondu");
        ev2.yap();
        Ev ev3=urun1.evYap("yali");
        ev3.yap();


    }
}
