/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy_pattern;

/**
 *
 * @author koushik
 */
public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }
    @Override
    public void display() {
        System.out.println(fileName+" is displaying!!!");
    }
    void loadFromDisk(){
        System.out.println(fileName+" is Loading!!!");
    }
    
}
