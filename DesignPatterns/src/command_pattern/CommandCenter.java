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
public class CommandCenter {
    Icommand icommand;
    public void setCommand(Icommand icommand){
        this.icommand = icommand;
    }
    public void ExecuteCommand(){
        icommand.execute();
    }
}
