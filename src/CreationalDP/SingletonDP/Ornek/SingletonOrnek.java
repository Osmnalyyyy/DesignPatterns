package CreationalDP.SingletonDP.Ornek;

public class SingletonOrnek {

    String str="Hi guys";
    Integer int1=12345;

    private static SingletonOrnek ornek1 = new SingletonOrnek();

    private SingletonOrnek() {
    }

    public static SingletonOrnek getOrnek() {
        return ornek1;
    }


}
