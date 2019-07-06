/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator_pattern;

/**
 *
 * @author koushik
 */
public class Main {
    public static void main(String[] args) {
        Widget widget = new Burger();
        widget.make();
        System.out.println("");
        
        Widget widget1 = new CheeseBurger(widget);
        widget1.make();
        System.out.println("");
        
        Widget widget2 = new ChickenBurger(widget1);
        widget2.make();
        System.out.println("");
    }
    
}
