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
public class Context {
    private Strategy strategy;
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public int getStrategy(int num1, int num2){
        return strategy.execute(num1, num2);
    }
    
}
