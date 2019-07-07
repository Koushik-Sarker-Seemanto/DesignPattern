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
public class Africa extends AbstractTemplate{

    @Override
    public void makeTerrain() {
        System.out.println("1 african terrain");
    }

    @Override
    public void makeTree() {
        System.out.println("5 african tree");
    }

    @Override
    public void makeAnimal() {
        System.out.println("2 african animal");
    }
    
}
