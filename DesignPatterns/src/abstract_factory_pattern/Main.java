/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_factory_pattern;

/**
 *
 * @author koushik
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProducer.getFactory(false);
        Shape shape1 = abstractFactory.getShape("Rectangle");
        shape1.draw();
        Shape shape2 = abstractFactory.getShape("Square");
        shape2.draw();
        
        AbstractFactory abstractFactory1 = FactoryProducer.getFactory(true);
        Shape shape3 = abstractFactory1.getShape("Square");
        shape3.draw();
        Shape shape4 = abstractFactory1.getShape("Rectangle");
        shape4.draw();
    }
}
