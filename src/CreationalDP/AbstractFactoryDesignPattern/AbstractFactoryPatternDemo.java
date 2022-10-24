package CreationalDP.AbstractFactoryDesignPattern;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory=FactoryProducer.getFactory("shape");
        // circle objesi oluşturuldu
        Shape shape1=shapeFactory.getShape("circle");
        shape1.draw();
        // rectangle objesi oluşturuldu
        Shape shape2=shapeFactory.getShape("rectangle");
        shape2.draw();
        // color factory olusturalım
        AbstractFactory colorFactory=FactoryProducer.getFactory("color");
        // red objesi oluşturuldu
        Color color1=colorFactory.getColor("red");
        color1.fill();
        // blue objesi oluşturuldu
        Color color2=colorFactory.getColor("blue");
        color2.fill();



    }



}
