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
public class ProgrammerCommand implements Icommand{
    private Programmer programmer;

    public ProgrammerCommand(Programmer programmer) {
        this.programmer = programmer;
    }


    @Override
    public void execute() {
        programmer.doProgramming();
    }
    
}
