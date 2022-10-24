package CreationalDP.SingletonDP.Ornek;

public class SingletonOrnekDemo {
    public static void main(String[] args) {

        SingletonOrnek ornek1=SingletonOrnek.getOrnek();
        System.out.println(ornek1.str);
        System.out.println(ornek1.int1);
    }
}
