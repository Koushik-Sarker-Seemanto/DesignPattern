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
public class Originator {
    private String state;
    private Caretaker caretaker;

    public Originator() {
        caretaker = new Caretaker();
    }
    
    public void setState(String state){
        System.out.println("State set: "+state);
        this.state = state;
    }
    public void currentState(){
        System.out.println("Current State: "+caretaker.getMemento().getState());
    }
    
    public void save(){
        System.out.println("state Saved: "+state);
        caretaker.setMemento(new Memento(state));
    }
    public void undo(){
        caretaker.undo();
        System.out.println("Undo Done");
        currentState();
    }
    public void redo(){
        caretaker.redo();
        System.out.println("Redo Done");
        currentState();
    }
    
}
