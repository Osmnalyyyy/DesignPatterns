package CreationalDP.BuilderDP;

public class BuilderRun {
    public static void main(String[] args) {
        // bu uzun çözüm ve tavsiye edilmez her set etmek icin bunu
        // tek tek yazmak mantikli olmaz 40 tane variable olsa yazmak zorlasir
        Product product1 = new Product();
        product1.setId(1L);
        product1.setName("name");
        product1.setPrice(100);
        product1.setDescription("decs");

        // Builder design pattern ile obje oluşturalım
        Product product2 = new Product.ProductBuilder().id(1L).
                name("name").
                description("decs").
                price(100).build();
        System.out.println("********** product1 ************** ");
        System.out.println(product1);
        System.out.println("********** product2 ************** ");
        System.out.println(product2);



    }
}
