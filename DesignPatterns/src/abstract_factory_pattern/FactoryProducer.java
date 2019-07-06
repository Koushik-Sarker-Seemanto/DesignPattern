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
public class FactoryProducer {
    public static AbstractFactory getFactory(boolean round){
        if(round){
            return new RoundShapeFactory();
        }
        else{
            return new NormalShapeFactory();
        }
    }
    
}
