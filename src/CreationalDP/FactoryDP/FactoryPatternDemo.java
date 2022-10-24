package CreationalDP.FactoryDP;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        /*  istenen bir yapı değil
        Circle circle1=new Circle();
        circle1.draw();
         */

// Uretmem gereken her seklin domain sinifini bilmem gerekmiyor,
// peki bu siniflara ihtiyac olmadan obje uretebilseydim

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("square");
        shape3.draw();




    }
}
