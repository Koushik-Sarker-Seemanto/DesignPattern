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
public class CheeseBurger extends BurgerDecorator{

    public CheeseBurger(Widget widget) {
        super(widget);
    }
    

    @Override
    public void make() {
        widget.make();
        addCheese();
    }
    public void addCheese(){
        System.out.println("Cheese Added.");
    }
    
}
