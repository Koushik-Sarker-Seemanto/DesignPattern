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
public class NormalShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(String type) {
        if(type==null){
            return null;
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
