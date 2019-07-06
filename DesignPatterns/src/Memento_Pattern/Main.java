/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento_Pattern;

/**
 *
 * @author koushik
 */
public class Main {
    public static void main(String[] args) {
        Originator ori = new Originator();
        ori.setState("Mehedi Voxod");
        ori.setState("Shimul Bot");
        ori.save();
        ori.setState("Partha Kamla");
        ori.save();
        ori.currentState();
        ori.undo();
        ori.redo();
    }
    
}
