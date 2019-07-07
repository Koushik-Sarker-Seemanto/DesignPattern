/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template_pattern;

/**
 *
 * @author koushik
 */
public abstract class AbstractTemplate {
    abstract public void makeTerrain();
    abstract public void makeTree();
    abstract public void makeAnimal();
    
    public void display(){
        makeTerrain();
        makeTree();
        makeAnimal();
    }
    
}
