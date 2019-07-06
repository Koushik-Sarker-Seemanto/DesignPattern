/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command_pattern;

/**
 *
 * @author koushik
 */
public class EngineerCommand implements Icommand{
    private Engineer engineer;

    public EngineerCommand(Engineer engineer) {
        this.engineer = engineer;
    }   

    @Override
    public void execute() {
        engineer.doWork();
    }
    
}
