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
public class ShapeFactory {
    public Shape getShape(String type){
        if(type==null){
            return null;
        }
        else if(type.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        else if(type.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        else if(type.equalsIgnoreCase("Square")){
            return new Square();
        }
        return null;
    }
}
