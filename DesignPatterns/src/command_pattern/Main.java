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
public class Main {
    public static void main(String[] args) {
        CommandCenter center = new CommandCenter();
        
        Programmer programmer = new Programmer();
        Engineer engineer = new Engineer();
        
        ProgrammerCommand pc = new ProgrammerCommand(programmer);
        EngineerCommand ec = new EngineerCommand(engineer);
        
        center.setCommand(pc);
        center.ExecuteCommand();
        center.setCommand(ec);
        center.ExecuteCommand();
    }
    
}
