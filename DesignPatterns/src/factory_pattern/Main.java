/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory_pattern;

/**
 *
 * @author koushik
 */
public class Main {
    public static void main(String[] args){
        ShapeFactory shape = new ShapeFactory();
        Shape shape1 = shape.getShape("Circle");
        shape1.draw();
        Shape shape2 = shape.getShape("Rectangle");
        shape2.draw();
        Shape shape3 = shape.getShape("Square");
        shape3.draw();
    }
}
