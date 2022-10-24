package CreationalDP.PrototypeDP;

public class PrototypeDPDemo {
    public static void main(String[] args) {
        Soldier availableSoldier = new Soldier(100, 45, 20, 50, 60, 5, "kilic", true);

        //clone özelliği ile asker üretelim
        Soldier notAvailableSoldier = availableSoldier.clone();
        notAvailableSoldier.setAvailableForWar(false);//aynı askeri klonladık sadece bu özelligi değiştirdik

    }
}
