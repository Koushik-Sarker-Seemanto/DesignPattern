/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy_pattern;

/**
 *
 * @author koushik
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context(new AddOperation());
        System.out.println("10 + 8 = "+context.getStrategy(10, 8));
        
        context = new Context(new SubstractOperation());
        System.out.println("10 - 8 = "+context.getStrategy(10, 8));
    }
    
}
