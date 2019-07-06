/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento_Pattern;

import java.util.ArrayList;

/**
 *
 * @author koushik
 */
public class Caretaker {
    ArrayList<Memento> arrayList = new ArrayList<>();
    int index = -1;
    
    void setMemento(Memento memento){
        arrayList.add(memento);
        index++;
    }
    
    Memento getMemento(){
        return arrayList.get(index);
    }
    void undo(){
        index--;
        arrayList.get(index);
    }
    void redo(){
        index++;
        arrayList.get(index);
    }
}
