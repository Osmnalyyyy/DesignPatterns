package CreationalDP.SingletonDP;

public class SingletonPatternDemo {
    public static void main(String[] args) {
      //  SingletonObject object=new SingletonObject(); constructor private oldugu için oradan yeni obje üretemedik
        SingletonObject object=SingletonObject.getInstance();
        System.out.println(object.message);// merhaba
        object.showMessage();// Merhaba batch 82 83


        // oluşan obje singleton mu
        SingletonObject object1=SingletonObject.getInstance();
        System.out.println(object1.message);// Merhaba batch 82 83

    }
}
