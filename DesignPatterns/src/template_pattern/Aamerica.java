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
public class Aamerica extends AbstractTemplate{
    @Override
    public void makeTerrain() {
        System.out.println("1 american terrain");
    }

    @Override
    public void makeTree() {
        System.out.println("5 american tree");
    }

    @Override
    public void makeAnimal() {
        System.out.println("2 american animal");
    }
}
