package CreationalDP.FactoryDP.Ornek;

public class Fabrika {

    public Ev evYap(String istek) {
        if (istek == null) return null;
        if (istek.equalsIgnoreCase("villa")) {
            return new Villa();
        } else if (istek.equalsIgnoreCase("yali")) {
            return new Yali();
        } else if (istek.equalsIgnoreCase("gecekondu")) {
            return new Gecekondu();
        }
        return null;
    }
}
