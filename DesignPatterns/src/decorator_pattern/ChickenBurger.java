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
public class ChickenBurger extends BurgerDecorator{

    public ChickenBurger(Widget widget) {
        super(widget);
    }

    @Override
    public void make() {
        widget.make();
        addChicken();
    }
    public void addChicken(){
        System.out.println("Chicken Added");
    }
    
}
