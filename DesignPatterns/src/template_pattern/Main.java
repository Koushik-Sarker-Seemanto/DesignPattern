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
public class Main {
    public static void main(String[] args) {
        AbstractTemplate asian = new Asia();
        asian.display();
        System.out.println("");
        AbstractTemplate african = new Africa();
        african.display();
        System.out.println("");
        AbstractTemplate american = new Aamerica();
        american.display();
    }
}
